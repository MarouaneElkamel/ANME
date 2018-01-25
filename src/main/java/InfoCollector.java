
import au.com.bytecode.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class InfoCollector {
    private static InfoCollector myInstance = new InfoCollector();
    private String separator = File.separator;
    private ArrayList<String> fileListed = new ArrayList();
    private ArrayList<Info> myData;
    private int dataloaded = 0;
    private Date first;
    private Date last;

    private InfoCollector() {
        this.setMyData(new ArrayList<Info>());
    }

    public static InfoCollector getInstance() {
        return myInstance;
    }

    public void loadFile(Path path) {
        if (!this.fileListed.contains(path)) {
            this.fileListed.add(path.toString());
            String[] lastsplit = path.getFileName().toString().split(".csv");
            String date = lastsplit[0];
            CSVReader reader = null;
            try {
                String[] nextLine;
                reader = new CSVReader((Reader)new FileReader(path.toString()), ';');
                boolean Test = true;
                while ((nextLine = reader.readNext()) != null && Test) {
                    if (!nextLine[0].trim().equals("hh:mm")) continue;
                    Test = false;
                }
                if (nextLine.length == 203) {
                    this.getMyData().add(new Info(nextLine, date));
                }
                while ((nextLine = reader.readNext()) != null && nextLine.length == 203) {
                    this.getMyData().add(new Info(nextLine, date));
                }
                Collections.sort(this.myData);
                this.dataloaded = this.myData.size();
                this.first = this.myData.get(0).getDate();
                this.last = this.myData.get(this.myData.size() - 1).getDate();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("the file was not found");
            }
            catch (IOException e) {
                e.printStackTrace();
                System.out.println("the file can't be read");
            }
        } else {
            System.out.println("file already loaded");
        }
    }

    public void loadFolde(String path) {
        try {
            Stream<Path> paths = Files.walk(Paths.get(path, new String[0]), new FileVisitOption[0]);
            Throwable throwable = null;
            try {
                paths.filter(x$0 -> Files.isRegularFile(x$0, new LinkOption[0])).forEach(filePath -> {
                            if (filePath != null && filePath.toString().contains(".csv") && !filePath.getFileName().toString().startsWith(".")) {
                                this.loadFile(filePath);
                            }
                        }
                );
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                if (paths != null) {
                    if (throwable != null) {
                        try {
                            paths.close();
                        }
                        catch (Throwable throwable3) {
                            throwable.addSuppressed(throwable3);
                        }
                    } else {
                        paths.close();
                    }
                }
            }
        }
        catch (IOException e) {
            System.out.println("folder not found");
        }
    }

    public ArrayList<Info> getMyData() {
        return this.myData;
    }

    public void setMyData(ArrayList<Info> myData) {
        this.myData = myData;
    }

    public int getDataloaded() {
        return this.dataloaded;
    }

    public void setDataloaded(int dataloaded) {
        this.dataloaded = dataloaded;
    }

    public Date getFirst() {
        return this.first;
    }

    public void setFirst(Date first) {
        this.first = first;
    }

    public Date getLast() {
        return this.last;
    }

    public void setLast(Date last) {
        this.last = last;
    }
}