
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;

public class test {

    public static void main(String[] args) {
        InfoCollector.getInstance().loadFolde("/Users/Elkamel/Desktop/test");
        int com = 1;
        for (Info k : InfoCollector.getInstance().getMyData()) {
            System.out.println(com);
            System.out.println(k.toString_39853_2120250746());
            System.out.println(k.toString_39888_305001998());
            System.out.println(k.toString_39908_305022216());
            System.out.println();
            System.out.println();
            ++com;
        }
        System.out.println(InfoCollector.getInstance().getDataloaded());
        System.out.println(InfoCollector.getInstance().getFirst());
        System.out.println(InfoCollector.getInstance().getLast());
    }
}