import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {

    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

  static  Map<String, String> ogrencıMap = new HashMap<>();
  static Scanner scan = new Scanner(System.in);
    public static void feykogrencıEkle(){
        ogrencıMap.put("123456","selım, can, 2008, 2222, 12, A");
        ogrencıMap.put("123457","salım, kan, 2008, 2224, 12, B");
        ogrencıMap.put("123458","salih, Tan, 2007, 2226, 12, C");

        
    }
public static  void ogrencıMenu() throws InterruptedException {
        String tercih="";
        do {


            System.out.println(Y+"==JAVA KOLEJI==" +
                    "\n" +
                    "==OGRENCI MENU==\n" +
                    "\n" +
                    "\t 1-ogrenci lıstesı yazdır\t\t\n" +
                    "\t 2-soyisimden ogrenci bulma\n" +
                    "\t 3-sınıf ve sube ıle ogrencı bulma\t\t\n" +
                    "\t 4-bılgılerını gırerek ogrenci ekleme\n" +
                    "\t 5-kımlık no ıle kayıt sılme\n" +
                    "\t A-ANAMENU\n" +
                    "\t Q-CIKIS\n"+W);
            tercih=scan.nextLine();
switch (tercih){
    case"1":
        ogrenciLıstesıYazdır();
        break;
    case"2":
        soyisimdenogrenciBulma();
        break;
    case"3":
        sınıfVeSubeIleOgrencıBulma();
        break;
    case"4":
        ogrencıEkle();
        break;
    case"5":
        tcNoIleOgrencıSılme();
        break;
    case"a":
    case"A":
       Depo.anaMenu();
        break;
    case"q":
    case"Q":
        Depo.projeDurdur();
        break;
    default:
        System.out.println("yanlıs tercıh yaptınız lutfen gecerlı bır tercıh yapınız");
}


        }while(!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
}

    private static void tcNoIleOgrencıSılme() {

        System.out.printf("sılınecek ogrencının tcno gırınız");
        String sılınecekOgrencı=scan.nextLine();

        String  sılınecekValue = ogrencıMap.get(sılınecekOgrencı);

        String  sonucValue=ogrencıMap.remove(sılınecekOgrencı);
        try {
            boolean sonuc=  sonucValue.equals(sılınecekValue);
        } catch (Exception e) {
            System.out.printf("ıstedıgınız tcno ıle ogrncı bulunamadı");
        }
    }

    private static void ogrencıEkle() {
        System.out.printf("tcNo gırınız");
        String tcNo = scan.nextLine();
        System.out.printf("ısım gırınız");
        String isim = scan.nextLine();
        System.out.printf("soyısım gırınız");
        String soyısım = scan.nextLine();
        System.out.printf("dogum yılı gırınız");
        String dogumyılı = scan.nextLine();
        System.out.printf("okulNO gırınız");
        String okulNo = scan.nextLine();
        System.out.printf("sınıf gırınız");
        String sınıf = scan.nextLine();
        System.out.printf("sube gırınız");
        String sube = scan.nextLine();

        String key = tcNo;
        String value = isim + " " + soyısım + " " + dogumyılı + " " + okulNo + " " +sınıf + " " +sube;
ogrencıMap.put(key,value);

    }

    private static void sınıfVeSubeIleOgrencıBulma() throws InterruptedException {
        System.out.println("aradıgınız ogrencının sınıfını gırınız");
        String ıstenenSınıf=scan.nextLine();

        System.out.println("aradıgınız ogrencının subesını gırınız");
        String ıstenenSube=scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogrencıMap.entrySet();

        System.out.println(B+"==JAVA KOLEJI==" +
                "\n" +
                "==SOYISIM ILE OGRENCI ARAMA==\n"+
                "tcNo    ısım  soyısım   d.yılı  okulNo   sınıf   sube "+W);
        for (Map.Entry<String, String> each: ogretmenlerEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String  eachValuearr[]=each.getValue().split(", ");
            if (ıstenenSınıf.equalsIgnoreCase(eachValuearr[4])&& ıstenenSube.equalsIgnoreCase(eachValuearr[5])){
                System.out.printf("%8s %-8s %-8s %-8s %-8s %-8s %-2s \n", eachKey ,eachValuearr[0],
                        eachValuearr[1], eachValuearr[2],eachValuearr[3],eachValuearr[4],
                        eachValuearr[5]);
            }
        }
        Thread.sleep(3000);




    }

    private static void soyisimdenogrenciBulma() throws InterruptedException {
        System.out.println("aradıgınız ogrencının soyısmını gırınız");
        String ıstenenSoyısım=scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogrencıMap.entrySet();

        System.out.println(B+"==JAVA KOLEJI==" +
                "\n" +
                "==SOYISIM ILE OGRENCI ARAMA==\n"+
                "tcNo    ısım  soyısım   d.yılı  okulNo   sınıf   sube "+W);
        for (Map.Entry<String, String> each: ogretmenlerEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String  eachValuearr[]=each.getValue().split(", ");
            if (ıstenenSoyısım.equalsIgnoreCase(eachValuearr[1])){
                System.out.printf("%8s %-8s %-8s %-8s %-8s %-8s %-2s \n", eachKey ,eachValuearr[0],
                        eachValuearr[1], eachValuearr[2],eachValuearr[3],eachValuearr[4],
                        eachValuearr[5]);
            }
        }
        Thread.sleep(3000);



    }

    private static void ogrenciLıstesıYazdır() throws InterruptedException {
        Set<Map.Entry<String, String>> ogrencılerEntrySet = ogrencıMap.entrySet();

        System.out.println(B+"==JAVA KOLEJI==" +
                "\n" +
                "==OGRENCI LISTESI==\n"+
                "tcNo    ısım   soyısım   d.yılı  okulNo   sınıf   sube "+W);
        for (Map.Entry<String, String> each: ogrencılerEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String  eachValuearr[]=each.getValue().split(", ");
            System.out.printf("%6s %-8s %-8s %-8s %-8s %-8s %s \n", eachKey ,eachValuearr[0],
                    eachValuearr[1], eachValuearr[2],eachValuearr[3],eachValuearr[4],
                    eachValuearr[5]);
        }
        Thread.sleep(3000);
    }

}
