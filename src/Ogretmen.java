import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    static Scanner scan = new Scanner(System.in);

    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void feykOgretmenEkle() {
        ogretmenlerMap.put("123456", "Ahmet, Salih, 1988, Matematik");
        ogretmenlerMap.put("123457", "Mehmet, Salih, 1989, Matematik");
        ogretmenlerMap.put("123458", "Ali, Sadık, 1980, Matematik");

    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println("lutfen yapmak ıstedıgınız ıslemı secınız");
            System.out.println(Y+"==JAVA KOLEJI==" +
                    "\n" +
                    "==OGRETMEN MENU==\n" +
                    "\n" +
                    "\t 1-ogretmen lıstesı yazdır\t\t\n" +
                    "\t 2-soyisimden ogretmen bulma\n" +
                    "\t 3-branstan ogretmen bulma\t\t\n" +
                    "\t 4-bılgılerını gırerek ogretmen bulma\n" +
                    "\t 5-kımlık no ıle kayıt sılme\n" +
                    "\t A-ANAMENU\n" +
                    "\t Q-CIKIS\n"+W);
            tercih = scan.nextLine();
            switch (tercih) {
                case "1":
                    ogretmenLıstesıYazdır();
                    break;
                case "2":
                    soyısımdenOgretmenBulma();
                    break;
                case "3":
                    branstanOgretmenBulma();
                    break;
                case "4":
                    ogretmenEkleme();

                    break;
                case "5":
                    kımlıkNoıleKayıtSılme();
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("yanlıs tercıh yaptınız lutfen gecerlı bır tercıh yapınız");


            }


        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();


    }

    private static void kımlıkNoıleKayıtSılme() {
        System.out.printf("sılınecek ogretmenın tcno gırınız");
        String sılınecekOgretmen=scan.nextLine();

           String  sılınecekValue = ogretmenlerMap.get(sılınecekOgretmen);

           String  sonucValue=ogretmenlerMap.remove(sılınecekOgretmen);
        try {
          boolean sonuc=  sonucValue.equals(sılınecekValue);
        } catch (Exception e) {
            System.out.printf("ıstedıgınız tcno ıle ogrtmn bulunamadı");
        }

    }




    private static void ogretmenEkleme() {
        System.out.printf("tcNo gırınız");
        String tcNo=scan.nextLine();
        System.out.printf("ısım gırınız");
        String isim=scan.nextLine();
        System.out.printf("soyısım gırınız");
        String soyısım=scan.nextLine();
        System.out.printf("dogum yılı gırınız");
        String dogumyılı=scan.nextLine();
        System.out.printf("brans gırınız");
        String brans=scan.nextLine();

        String eklenecekValue=isim+ ", "+ soyısım + ", "+dogumyılı+", "+brans;
        ogretmenlerMap.put(tcNo,eklenecekValue);
    }

    private static void branstanOgretmenBulma() throws InterruptedException {
        System.out.printf("aradıgınız ogretmenın bransını gırınız");
        String ıstenenBrans=scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();

        System.out.println(B+"==JAVA KOLEJI==" +
                "\n" +
                "==Brans ILE OGRETMEN ARAMA==\n"+
                "tcNo   ısım  soyısım   d.yılı  1brans "+W);
        for (Map.Entry<String, String> each: ogretmenlerEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String  eachValuearr[]=each.getValue().split(", ");
            if (ıstenenBrans.equalsIgnoreCase(eachValuearr[3])){
                System.out.printf("%6s %-6s %-8s %4s %s \n", eachKey ,eachValuearr[0],
                        eachValuearr[1], eachValuearr[2],eachValuearr[3]);
            }
        }
        Thread.sleep(3000);


    }

    private static void soyısımdenOgretmenBulma() throws InterruptedException {
        System.out.printf("aradıgınız ogretmenın soyısmını gırınız");
       String ıstenenSoyısım=scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();

        System.out.println(B+"==JAVA KOLEJI==" +
                "\n" +
                "==SOYISIM ILE OGRETMEN ARAMA==\n"+
                "tcNo   ısım  soyısım   d.yılı  1brans "+W);
        for (Map.Entry<String, String> each: ogretmenlerEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String  eachValuearr[]=each.getValue().split(", ");
           if (ıstenenSoyısım.equalsIgnoreCase(eachValuearr[1])){
               System.out.printf("%6s %-6s %-8s %4s %s \n", eachKey ,eachValuearr[0],
                       eachValuearr[1], eachValuearr[2],eachValuearr[3]);
           }
        }
        Thread.sleep(3000);


    }

    public static void ogretmenLıstesıYazdır() throws InterruptedException {
        Set<Map.Entry<String, String>> ogretmenlerEntrySet = ogretmenlerMap.entrySet();

        System.out.println(B+"==JAVA KOLEJI==" +
                "\n" +
                "==OGRETMEN LISTESI==\n"+
                "tcNo   ısım  soyısım   d.yılı  1brans "+W);
        for (Map.Entry<String, String> each: ogretmenlerEntrySet
             ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String  eachValuearr[]=each.getValue().split(", ");
            System.out.printf("%6s %-6s %-8s %4s %s \n", eachKey ,eachValuearr[0],
                    eachValuearr[1], eachValuearr[2],eachValuearr[3]);
        }
        Thread.sleep(3000);

    }
}
