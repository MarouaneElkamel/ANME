
import au.com.bytecode.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class test {

    public static void main(String[] args) throws IOException {
        InfoCollector.getInstance().loadFolde("/Users/Elkamel/Desktop/ANME");
//        int com = 1;
//        for (Info k : InfoCollector.getInstance().getMyData()) {
//            System.out.println(com);
//            System.out.println(k.toString_39853_2120250746());
//            System.out.println(k.toString_39888_305001998());
//            System.out.println(k.toString_39908_305022216());
//            System.out.println();
//            System.out.println();
//            ++com;
//        }
//        System.out.println(InfoCollector.getInstance().getDataloaded());
//        System.out.println(InfoCollector.getInstance().getFirst());
//        System.out.println(InfoCollector.getInstance().getLast());
        CSVReader reader = null;
        String[] nextLine;
        reader = new CSVReader((Reader)new FileReader("/Users/Elkamel/Desktop/ANME/2017-04-22.csv"), ';');
        boolean Test = true;
        while ((nextLine = reader.readNext()) != null && Test) {
            System.out.println(Arrays.toString(nextLine));
        }
    }
}