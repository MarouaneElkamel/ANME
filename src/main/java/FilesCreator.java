import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FilesCreator {
    ArrayList<ArrayList<Info>> databymonth;
    String path;

    FilesCreator(String path) {
        this.path = path;
        this.databymonth = new ArrayList();
        ArrayList<Info> data = InfoCollector.getInstance().getMyData();
        if (data.size() > 0) {

            Object month = data.get(0).getMonth();
            ArrayList<Info> tmp22 = new ArrayList();
            for (Info i : data) {
                if (i.getMonth().equals(month)) {
                    tmp22.add(i);
                    continue;
                }
                this.databymonth.add((ArrayList<Info>)tmp22);
                tmp22 = new ArrayList<Info>();
                tmp22.add(i);
                month = i.getMonth();
            }
            if (!tmp22.isEmpty()) {
                this.databymonth.add((ArrayList<Info>)tmp22);
            }
        }
        for (ArrayList T : this.databymonth) {
            this.createFiles(T);
        }
    }

    private void createFiles(ArrayList<Info> data) {
        System.out.print(this.path);
        if (data.size() > 0) {
            int day2;
            File fichier2;
            File fichier3;
            File fichier1;
            String s1 = new SimpleDateFormat("dd").format(data.get(0).getDate()).toString();
            String s2 = new SimpleDateFormat("dd").format(data.get(data.size() - 1).getDate()).toString();
            int day1 = Integer.parseInt(s1);
            if (day1 == (day2 = Integer.parseInt(s2))) {
                fichier1 = new File(this.path + "ANME_Poly_cristallins_" + new SimpleDateFormat("yyyy-MM-dd").format(data.get(0).getDate()).toString() + ".txt");
                fichier2 = new File(this.path + "ANME_Monocristallins_" + new SimpleDateFormat("yyyy-MM-dd").format(data.get(0).getDate()).toString() + ".txt");
                fichier3 = new File(this.path + "ANME_Thin_film_" + new SimpleDateFormat("yyyy-MM-dd").format(data.get(0).getDate()).toString() + ".txt");
            } else {
                fichier1 = new File(this.path + "ANME_Poly_cristallins_" + new SimpleDateFormat("yyyy-MM").format(data.get(0).getDate()).toString() + ".txt");
                fichier2 = new File(this.path + "ANME_Monocristallins_" + new SimpleDateFormat("yyyy-MM").format(data.get(0).getDate()).toString() + ".txt");
                fichier3 = new File(this.path + "ANME_Thin_film _" + new SimpleDateFormat("yyyy-MM").format(data.get(0).getDate()).toString() + ".txt");
            }
            try {
                FileOutputStream fos1 = new FileOutputStream(fichier1);
                OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
                FileOutputStream fos2 = new FileOutputStream(fichier2);
                OutputStreamWriter osw2 = new OutputStreamWriter(fos2);
                FileOutputStream fos3 = new FileOutputStream(fichier3);
                OutputStreamWriter osw3 = new OutputStreamWriter(fos3);
                BufferedWriter bw1 = new BufferedWriter(osw1);
                BufferedWriter bw2 = new BufferedWriter(osw2);
                BufferedWriter bw3 = new BufferedWriter(osw3);
                bw1.write("Date Locale;Gipm (w par m\u00b2);Tam (\u00b0C);Va (V);Ia (A);Pa (Kw);Tm (\u00b0C);AC-U L1 (V);AC-U L2 (V);AC-U L3 (V);AC-P L1 (W);AC-P L2 (W);AC-P L3 (W)");
                bw1.newLine();
                bw2.write("Date Locale;Gipm (w par m\u00b2);Tam (\u00b0C);Va (V);Ia (A);Pa (Kw);Tm (\u00b0C);AC-U L1 (V);AC-U L2 (V);AC-U L3 (V);AC-P L1 (W);AC-P L2 (W);AC-P L3 (W)");
                bw2.newLine();
                bw3.write("Date Locale;Gipm (w par m\u00b2);Tam (\u00b0C);Va (V);Ia (A);Pa (Kw);Tm (\u00b0C);AC-U (V);AC-P (W)");
                bw3.newLine();
                for (Info I : data) {
                    bw3.write(I.toString_39853_2120250746());
                    bw3.newLine();
                    bw1.write(I.toString_39888_305001998());
                    bw1.newLine();
                    bw2.write(I.toString_39908_305022216());
                    bw2.newLine();
                }
                bw1.close();
                osw1.close();
                fos1.close();
                bw2.close();
                osw2.close();
                fos2.close();
                bw3.close();
                osw3.close();
                fos3.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("output files problem");
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}