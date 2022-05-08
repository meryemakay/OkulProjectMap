import java.util.Scanner;

public class Depo {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";


    static Scanner scan=new Scanner(System.in);
    public static void anaMenu() throws InterruptedException {

String tercıh="";

        do {
        System.out.println(Y+"==JAVA KOLEJI==" +
                "\n" +
                "==ANA MENU==\n" +
                "\n" +
                "\t 1-okul bılgılerı goruntule\t\t\n" +
                "\t 2-ogretmen menu\n" +
                "\t 3-ogrencı mwnu\t\t\n" +
                "\t Q-CIKIS\n"+W);
        System.out.println("lutfen yapmak ıstedıgınız ıslemı secınız");

tercıh=scan.nextLine();
switch (tercıh) {
    case "1":  //okul bılgılerı
        okulBilgileriniYazdir();
        break;
    case "2": //ogretmen menu
Ogretmen.ogretmenMenu();
        break;
    case "3": //ogrencı menu
        Ogrenci.ogrencıMenu();
        break;
    case "q":
    case "Q":
        break;
    default:
        System.out.println("yanlıs tercıh yaptınız bırdaha deneyınız");
}

}while(!tercıh.equalsIgnoreCase("q"));
Depo.projeDurdur();
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("==JAVA KOLEJI==\n" +
                "\t\t adres :"+ Okul.adres +
                "\n\t\t telefon" + Okul.tel);
        Thread.sleep(3000);
    }

    public static void projeDurdur() {
        System.out.println("okul projesınden cıkısınız yapılmıstır");
        System.exit(0);
    }

}
