import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Info
        implements Comparable<Info> {
    private String month;
    private String year;
    private Date Time;
    private String SENS0802_39853_IntSolIrr;
    private String SENS0802_39853_TmpMdul;
    private String SENS0802_39888_IntSolIrr;
    private String SENS0802_39888_TmpMdul;
    private String SENS0802_39908_IntSolIrr;
    private String SENS0802_39908_TmpAmb;
    private String SENS0802_39908_TmpMdul;
    private String WRHF0U8G_2120250746_A_Ms_Amp;
    private String WRHF0U8G_2120250746_A_Ms_Vol;
    private String WRHF0U8G_2120250746_A_Ms_Watt;
    private String WRHF0U8G_2120250746_GridMs_PhV_phsA;
    private String WRHF0U8G_2120250746_GridMs_W_phsA;
    private String WRHF0U8G_2120250746_Pac;
    private String WRST1Y5D_305001998_A_Ms_Amp;
    private String WRST1Y5D_305001998_A_Ms_Vol;
    private String WRST1Y5D_305001998_A_Ms_Watt;
    private String WRST1Y5D_305001998_GridMs_PhV_phsA;
    private String WRST1Y5D_305001998_GridMs_PhV_phsB;
    private String WRST1Y5D_305001998_GridMs_PhV_phsC;
    private String WRST1Y5D_305001998_GridMs_W_phsA;
    private String WRST1Y5D_305001998_GridMs_W_phsB;
    private String WRST1Y5D_305001998_GridMs_W_phsC;
    private String WRST1Y5D_305001998_Pac;
    private String WRST285D_305022216_A_Ms_Amp;
    private String WRST285D_305022216_A_Ms_Vol;
    private String WRST285D_305022216_A_Ms_Watt;
    private String WRST285D_305022216_GridMs_PhV_phsA;
    private String WRST285D_305022216_GridMs_PhV_phsB;
    private String WRST285D_305022216_GridMs_PhV_phsC;
    private String WRST285D_305022216_GridMs_W_phsA;
    private String WRST285D_305022216_GridMs_W_phsB;
    private String WRST285D_305022216_GridMs_W_phsC;


    private String WRST285D_305022216_Pac;

    public Info() {
    }

    public Info(String[] newline, String jour) {
        String[] year = jour.split("-");
        Calendar cal = Calendar.getInstance();
        cal.set(1, Integer.parseInt(year[0]));
        this.setYear(year[0]);
        cal.set(2, Integer.parseInt(year[1]) - 1);
        this.setMonth(year[1]);
        cal.set(5, Integer.parseInt(year[2]));
        String[] time = newline[0].split(":");
        cal.set(11, Integer.parseInt(time[0]));
        cal.set(12, Integer.parseInt(time[1]));
        cal.set(13, 0);
        this.setDate(cal.getTime());
        this.setSENS0802_39853_IntSolIrr(newline[14].trim());
        this.setSENS0802_39853_TmpMdul(newline[19].trim());
        this.setSENS0802_39888_IntSolIrr(newline[26].trim());
        this.setSENS0802_39888_TmpMdul(newline[31].trim());
        this.setSENS0802_39908_IntSolIrr(newline[38].trim());
        this.setSENS0802_39908_TmpMdul(newline[43].trim());
        this.setSENS0802_39908_TmpAmb(newline[40].trim());
        this.setWRHF0U8G_2120250746_A_Ms_Amp(newline[81].trim());
        this.setWRHF0U8G_2120250746_A_Ms_Vol(newline[82].trim());
        this.setWRHF0U8G_2120250746_A_Ms_Watt(newline[83].trim());
        this.setWRHF0U8G_2120250746_GridMs_PhV_phsA(newline[90].trim());
        this.setWRHF0U8G_2120250746_GridMs_W_phsA(newline[95].trim());
        this.setWRHF0U8G_2120250746_Pac(newline[110].trim());
        this.setWRST1Y5D_305001998_A_Ms_Amp(newline[113].trim());
        this.setWRST1Y5D_305001998_A_Ms_Vol(newline[114].trim());
        this.setWRST1Y5D_305001998_A_Ms_Watt(newline[115].trim());
        this.setWRST1Y5D_305001998_GridMs_PhV_phsA(newline[128].trim());
        this.setWRST1Y5D_305001998_GridMs_PhV_phsB(newline[129].trim());
        this.setWRST1Y5D_305001998_GridMs_PhV_phsC(newline[130].trim());
        this.setWRST1Y5D_305001998_GridMs_W_phsA(newline[140].trim());
        this.setWRST1Y5D_305001998_GridMs_W_phsB(newline[141].trim());
        this.setWRST1Y5D_305001998_GridMs_W_phsC(newline[142].trim());
        this.setWRST1Y5D_305001998_Pac(newline[154].trim());
        this.setWRST285D_305022216_A_Ms_Amp(newline[158].trim());
        this.setWRST285D_305022216_A_Ms_Vol(newline[159].trim());
        this.setWRST285D_305022216_A_Ms_Watt(newline[160].trim());
        this.setWRST285D_305022216_GridMs_PhV_phsA(newline[173].trim());
        this.setWRST285D_305022216_GridMs_PhV_phsB(newline[174].trim());
        this.setWRST285D_305022216_GridMs_PhV_phsC(newline[175].trim());
        this.setWRST285D_305022216_GridMs_W_phsA(newline[185].trim());
        this.setWRST285D_305022216_GridMs_W_phsB(newline[186].trim());
        this.setWRST285D_305022216_GridMs_W_phsC(newline[187].trim());
        this.setWRST285D_305022216_Pac(newline[199].trim());
    }

    public Date getDate() {
        return this.Time;
    }

    public void setDate(Date date) {
        this.Time = date;
    }

    public String getSENS0802_39853_IntSolIrr() {
        return this.SENS0802_39853_IntSolIrr;
    }

    public void setSENS0802_39853_IntSolIrr(String SENS0802_39853_IntSolIrr) {
        this.SENS0802_39853_IntSolIrr = SENS0802_39853_IntSolIrr;
    }

    public String getSENS0802_39853_TmpMdul() {
        return this.SENS0802_39853_TmpMdul;
    }

    public void setSENS0802_39853_TmpMdul(String SENS0802_39853_TmpMdul) {
        this.SENS0802_39853_TmpMdul = SENS0802_39853_TmpMdul;
    }

    public String getSENS0802_39888_IntSolIrr() {
        return this.SENS0802_39888_IntSolIrr;
    }

    public void setSENS0802_39888_IntSolIrr(String SENS0802_39888_IntSolIrr) {
        this.SENS0802_39888_IntSolIrr = SENS0802_39888_IntSolIrr;
    }

    public String getSENS0802_39888_TmpMdul() {
        return this.SENS0802_39888_TmpMdul;
    }

    public void setSENS0802_39888_TmpMdul(String SENS0802_39888_TmpMdul) {
        this.SENS0802_39888_TmpMdul = SENS0802_39888_TmpMdul;
    }

    public String getSENS0802_39908_IntSolIrr() {
        return this.SENS0802_39908_IntSolIrr;
    }

    public void setSENS0802_39908_IntSolIrr(String SENS0802_39908_IntSolIrr) {
        this.SENS0802_39908_IntSolIrr = SENS0802_39908_IntSolIrr;
    }

    public String getSENS0802_39908_TmpAmb() {
        return this.SENS0802_39908_TmpAmb;
    }

    public void setSENS0802_39908_TmpAmb(String SENS0802_39908_TmpAmb) {
        this.SENS0802_39908_TmpAmb = SENS0802_39908_TmpAmb;
    }

    public String getSENS0802_39908_TmpMdul() {
        return this.SENS0802_39908_TmpMdul;
    }

    public void setSENS0802_39908_TmpMdul(String SENS0802_39908_TmpMdul) {
        this.SENS0802_39908_TmpMdul = SENS0802_39908_TmpMdul;
    }

    public String getWRHF0U8G_2120250746_A_Ms_Amp() {
        return this.WRHF0U8G_2120250746_A_Ms_Amp;
    }

    public void setWRHF0U8G_2120250746_A_Ms_Amp(String WRHF0U8G_2120250746_A_Ms_Amp) {
        this.WRHF0U8G_2120250746_A_Ms_Amp = WRHF0U8G_2120250746_A_Ms_Amp;
    }

    public String getWRHF0U8G_2120250746_A_Ms_Vol() {
        return this.WRHF0U8G_2120250746_A_Ms_Vol;
    }

    public void setWRHF0U8G_2120250746_A_Ms_Vol(String WRHF0U8G_2120250746_A_Ms_Vol) {
        this.WRHF0U8G_2120250746_A_Ms_Vol = WRHF0U8G_2120250746_A_Ms_Vol;
    }

    public String getWRHF0U8G_2120250746_A_Ms_Watt() {
        return this.WRHF0U8G_2120250746_A_Ms_Watt;
    }

    public void setWRHF0U8G_2120250746_A_Ms_Watt(String WRHF0U8G_2120250746_A_Ms_Watt) {
        this.WRHF0U8G_2120250746_A_Ms_Watt = WRHF0U8G_2120250746_A_Ms_Watt;
    }

    public String getWRHF0U8G_2120250746_GridMs_PhV_phsA() {
        return this.WRHF0U8G_2120250746_GridMs_PhV_phsA;
    }

    public void setWRHF0U8G_2120250746_GridMs_PhV_phsA(String WRHF0U8G_2120250746_GridMs_PhV_phsA) {
        this.WRHF0U8G_2120250746_GridMs_PhV_phsA = WRHF0U8G_2120250746_GridMs_PhV_phsA;
    }

    public String getWRHF0U8G_2120250746_Pac() {
        return this.WRHF0U8G_2120250746_Pac;
    }

    public void setWRHF0U8G_2120250746_Pac(String WRHF0U8G_2120250746_Pac) {
        this.WRHF0U8G_2120250746_Pac = WRHF0U8G_2120250746_Pac;
    }

    public String getWRST1Y5D_305001998_A_Ms_Amp() {
        return this.WRST1Y5D_305001998_A_Ms_Amp;
    }

    public void setWRST1Y5D_305001998_A_Ms_Amp(String WRST1Y5D_305001998_A_Ms_Amp) {
        this.WRST1Y5D_305001998_A_Ms_Amp = WRST1Y5D_305001998_A_Ms_Amp;
    }

    public String getWRST1Y5D_305001998_A_Ms_Vol() {
        return this.WRST1Y5D_305001998_A_Ms_Vol;
    }

    public void setWRST1Y5D_305001998_A_Ms_Vol(String WRST1Y5D_305001998_A_Ms_Vol) {
        this.WRST1Y5D_305001998_A_Ms_Vol = WRST1Y5D_305001998_A_Ms_Vol;
    }

    public String getWRST1Y5D_305001998_A_Ms_Watt() {
        return this.WRST1Y5D_305001998_A_Ms_Watt;
    }

    public void setWRST1Y5D_305001998_A_Ms_Watt(String WRST1Y5D_305001998_A_Ms_Watt) {
        this.WRST1Y5D_305001998_A_Ms_Watt = WRST1Y5D_305001998_A_Ms_Watt;
    }

    public String getWRST1Y5D_305001998_GridMs_PhV_phsA() {
        return this.WRST1Y5D_305001998_GridMs_PhV_phsA;
    }

    public void setWRST1Y5D_305001998_GridMs_PhV_phsA(String WRST1Y5D_305001998_GridMs_PhV_phsA) {
        this.WRST1Y5D_305001998_GridMs_PhV_phsA = WRST1Y5D_305001998_GridMs_PhV_phsA;
    }

    public String getWRST1Y5D_305001998_Pac() {
        return this.WRST1Y5D_305001998_Pac;
    }

    public void setWRST1Y5D_305001998_Pac(String WRST1Y5D_305001998_Pac) {
        this.WRST1Y5D_305001998_Pac = WRST1Y5D_305001998_Pac;
    }

    public String getWRST285D_305022216_A_Ms_Amp() {
        return this.WRST285D_305022216_A_Ms_Amp;
    }

    public void setWRST285D_305022216_A_Ms_Amp(String WRST285D_305022216_A_Ms_Amp) {
        this.WRST285D_305022216_A_Ms_Amp = WRST285D_305022216_A_Ms_Amp;
    }

    public String getWRST285D_305022216_A_Ms_Vol() {
        return this.WRST285D_305022216_A_Ms_Vol;
    }

    public void setWRST285D_305022216_A_Ms_Vol(String WRST285D_305022216_A_Ms_Vol) {
        this.WRST285D_305022216_A_Ms_Vol = WRST285D_305022216_A_Ms_Vol;
    }

    public String getWRST285D_305022216_A_Ms_Watt() {
        return this.WRST285D_305022216_A_Ms_Watt;
    }

    public void setWRST285D_305022216_A_Ms_Watt(String WRST285D_305022216_A_Ms_Watt) {
        this.WRST285D_305022216_A_Ms_Watt = WRST285D_305022216_A_Ms_Watt;
    }

    public String getWRST285D_305022216_GridMs_PhV_phsA() {
        return this.WRST285D_305022216_GridMs_PhV_phsA;
    }

    public void setWRST285D_305022216_GridMs_PhV_phsA(String WRST285D_305022216_GridMs_PhV_phsA) {
        this.WRST285D_305022216_GridMs_PhV_phsA = WRST285D_305022216_GridMs_PhV_phsA;
    }

    public String getWRST285D_305022216_Pac() {
        return this.WRST285D_305022216_Pac;
    }

    public void setWRST285D_305022216_Pac(String WRST285D_305022216_Pac) {
        this.WRST285D_305022216_Pac = WRST285D_305022216_Pac;
    }

    public String toString() {
        return new SimpleDateFormat("yyyy-MM-dd").format(this.getDate()).toString() + 'T' + new SimpleDateFormat("HH:mm:ss").format(this.getDate()).toString() + "+01:00;";
    }

    public String toString_39853_2120250746() {
        String s = "";
        s = s.concat(this.toString());
        s = s.concat(this.getSENS0802_39853_IntSolIrr());
        s = s.concat(";");
        s = s.concat(this.getSENS0802_39908_TmpAmb());
        s = s.concat(";");
        s = s.concat(this.getSENS0802_39853_TmpMdul());
        s = s.concat(";");
        s = s.concat(this.getWRHF0U8G_2120250746_A_Ms_Amp());
        s = s.concat(";");
        s = s.concat(this.getWRHF0U8G_2120250746_A_Ms_Vol());
        s = s.concat(";");
        s = s.concat(this.getWRHF0U8G_2120250746_A_Ms_Watt());
        s = s.concat(";");
        s = s.concat(this.getWRHF0U8G_2120250746_GridMs_PhV_phsA());
        s = s.concat(";");
        s = s.concat(this.getWRHF0U8G_2120250746_GridMs_W_phsA());
        return s;
    }

    public String toString_39888_305001998() {
        String s = "";
        s = s.concat(this.toString());
        s = s.concat(this.getSENS0802_39888_IntSolIrr());
        s = s.concat(";");
        s = s.concat(this.getSENS0802_39908_TmpAmb());
        s = s.concat(";");
        s = s.concat(this.getSENS0802_39888_TmpMdul());
        s = s.concat(";");
        s = s.concat(this.getWRST1Y5D_305001998_A_Ms_Amp());
        s = s.concat(";");
        s = s.concat(this.getWRST1Y5D_305001998_A_Ms_Vol());
        s = s.concat(";");
        s = s.concat(this.getWRST1Y5D_305001998_A_Ms_Watt());
        s = s.concat(";");
        s = s.concat(this.getWRST1Y5D_305001998_GridMs_PhV_phsA());
        s = s.concat(";");
        s = s.concat(this.getWRST1Y5D_305001998_GridMs_PhV_phsB());
        s = s.concat(";");
        s = s.concat(this.getWRST1Y5D_305001998_GridMs_PhV_phsC());
        s = s.concat(";");
        s = s.concat(this.getWRST1Y5D_305001998_GridMs_W_phsA());
        s = s.concat(";");
        s = s.concat(this.getWRST1Y5D_305001998_GridMs_W_phsB());
        s = s.concat(";");
        s = s.concat(this.getWRST1Y5D_305001998_GridMs_W_phsC());

        return s;
    }

    public String toString_39908_305022216() {
        String s = "";
        s = s.concat(this.toString());
        s = s.concat(this.getSENS0802_39908_IntSolIrr());
        s = s.concat(";");
        s = s.concat(this.getSENS0802_39908_TmpAmb());
        s = s.concat(";");
        s = s.concat(this.getSENS0802_39908_TmpMdul());
        s = s.concat(";");
        s = s.concat(this.getWRST285D_305022216_A_Ms_Amp());
        s = s.concat(";");
        s = s.concat(this.getWRST285D_305022216_A_Ms_Vol());
        s = s.concat(";");
        s = s.concat(this.getWRST285D_305022216_A_Ms_Watt());
        s = s.concat(";");
        s = s.concat(this.getWRST285D_305022216_GridMs_PhV_phsA());
        s = s.concat(";");
        s = s.concat(this.getWRST285D_305022216_GridMs_PhV_phsB());
        s = s.concat(";");
        s = s.concat(this.getWRST285D_305022216_GridMs_PhV_phsC());
        s = s.concat(";");
        s = s.concat(this.getWRST285D_305022216_GridMs_W_phsA());
        s = s.concat(";");
        s = s.concat(this.getWRST285D_305022216_GridMs_W_phsB());
        s = s.concat(";");
        s = s.concat(this.getWRST285D_305022216_GridMs_W_phsC());


        return s;
    }

    @Override
    public int compareTo(Info o) {
        return this.getDate().compareTo(o.getDate());
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }




    public String getWRST285D_305022216_GridMs_PhV_phsB() {
        return WRST285D_305022216_GridMs_PhV_phsB;
    }

    public void setWRST285D_305022216_GridMs_PhV_phsB(String WRST285D_305022216_GridMs_PhV_phsB) {
        this.WRST285D_305022216_GridMs_PhV_phsB = WRST285D_305022216_GridMs_PhV_phsB;
    }

    public String getWRST285D_305022216_GridMs_PhV_phsC() {
        return WRST285D_305022216_GridMs_PhV_phsC;
    }

    public void setWRST285D_305022216_GridMs_PhV_phsC(String WRST285D_305022216_GridMs_PhV_phsC) {
        this.WRST285D_305022216_GridMs_PhV_phsC = WRST285D_305022216_GridMs_PhV_phsC;
    }

    public String getWRST285D_305022216_GridMs_W_phsA() {
        return WRST285D_305022216_GridMs_W_phsA;
    }

    public void setWRST285D_305022216_GridMs_W_phsA(String WRST285D_305022216_GridMs_W_phsA) {
        this.WRST285D_305022216_GridMs_W_phsA = WRST285D_305022216_GridMs_W_phsA;
    }

    public String getWRST285D_305022216_GridMs_W_phsB() {
        return WRST285D_305022216_GridMs_W_phsB;
    }

    public void setWRST285D_305022216_GridMs_W_phsB(String WRST285D_305022216_GridMs_W_phsB) {
        this.WRST285D_305022216_GridMs_W_phsB = WRST285D_305022216_GridMs_W_phsB;
    }

    public String getWRST285D_305022216_GridMs_W_phsC() {
        return WRST285D_305022216_GridMs_W_phsC;
    }

    public void setWRST285D_305022216_GridMs_W_phsC(String WRST285D_305022216_GridMs_W_phsC) {
        this.WRST285D_305022216_GridMs_W_phsC = WRST285D_305022216_GridMs_W_phsC;
    }

    public String getWRHF0U8G_2120250746_GridMs_W_phsA() {
        return WRHF0U8G_2120250746_GridMs_W_phsA;
    }

    public void setWRHF0U8G_2120250746_GridMs_W_phsA(String WRHF0U8G_2120250746_GridMs_W_phsA) {
        this.WRHF0U8G_2120250746_GridMs_W_phsA = WRHF0U8G_2120250746_GridMs_W_phsA;
    }
    public String getWRST1Y5D_305001998_GridMs_PhV_phsB() {
        return WRST1Y5D_305001998_GridMs_PhV_phsB;
    }

    public void setWRST1Y5D_305001998_GridMs_PhV_phsB(String WRST1Y5D_305001998_GridMs_PhV_phsB) {
        this.WRST1Y5D_305001998_GridMs_PhV_phsB = WRST1Y5D_305001998_GridMs_PhV_phsB;
    }

    public String getWRST1Y5D_305001998_GridMs_PhV_phsC() {
        return WRST1Y5D_305001998_GridMs_PhV_phsC;
    }

    public void setWRST1Y5D_305001998_GridMs_PhV_phsC(String WRST1Y5D_305001998_GridMs_PhV_phsC) {
        this.WRST1Y5D_305001998_GridMs_PhV_phsC = WRST1Y5D_305001998_GridMs_PhV_phsC;
    }

    public String getWRST1Y5D_305001998_GridMs_W_phsA() {
        return WRST1Y5D_305001998_GridMs_W_phsA;
    }

    public void setWRST1Y5D_305001998_GridMs_W_phsA(String WRST1Y5D_305001998_GridMs_W_phsA) {
        this.WRST1Y5D_305001998_GridMs_W_phsA = WRST1Y5D_305001998_GridMs_W_phsA;
    }

    public String getWRST1Y5D_305001998_GridMs_W_phsB() {
        return WRST1Y5D_305001998_GridMs_W_phsB;
    }

    public void setWRST1Y5D_305001998_GridMs_W_phsB(String WRST1Y5D_305001998_GridMs_W_phsB) {
        this.WRST1Y5D_305001998_GridMs_W_phsB = WRST1Y5D_305001998_GridMs_W_phsB;
    }

    public String getWRST1Y5D_305001998_GridMs_W_phsC() {

        return WRST1Y5D_305001998_GridMs_W_phsC;
    }

    public void setWRST1Y5D_305001998_GridMs_W_phsC(String WRST1Y5D_305001998_GridMs_W_phsC) {
        this.WRST1Y5D_305001998_GridMs_W_phsC = WRST1Y5D_305001998_GridMs_W_phsC;
    }



}