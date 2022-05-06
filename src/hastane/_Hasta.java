package hastane;

import java.util.*;

public class _Hasta {
    static Map<String, String> hastalar = new HashMap<>();
    static Set<Map.Entry<String, String>> setHastalar = hastalar.entrySet();
    static Scanner scan = new Scanner(System.in);
    static boolean AcilMi = true;

    public static void Hasta() {
        hastalar.put("111", "Warren, Traven, Allerji");
        hastalar.put("222", "Petanow, William, Bas agrisi");
        hastalar.put("333", "Sophia, George, Diabet");
        hastalar.put("444", "Emma, Tristan, Soguk alginligi");
        hastalar.put("555", "Darian, Luis, Migren");
        hastalar.put("666", "Peter, Cole, Kalp Hastaliklari");
    }

    public static void idIleDurumBilgisiBul() {
        System.out.println("Bulmak istediginiz ID : ");
        String idBul = "";
        boolean flag = true;

        do {
            idBul = "";
            try {
                idBul = scan.nextLine();
                for (Map.Entry<String, String> each : setHastalar) {
                    String eachKey = each.getKey();
                    if (idBul.equals(eachKey)) {
                        System.out.println("Bulundu");
                        flag = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Gecerli bir ID giriniz.");
                idIleDurumBilgisiBul();
            }
        } while (flag);

        System.out.println("Bulmak istediginiz hastanin hastaligi : ");
        String hastalikBul = scan.nextLine();
        System.out.println("\t === HASTALAR ===\n" +
                "ID    ISIM      SOYISIM   HASTALIK");

        for (Map.Entry<String, String> each : setHastalar) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");
            if (idBul.equalsIgnoreCase(each.getKey())) {
                System.out.printf("%-3s   %-7s    %-8s  %-15s", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2]);
                _Doktor.doktorBul(hastalikBul);
                break;
            } else {
                System.out.println("Girdiginiz ID´ye sahip hasta bulunamadi.");
                break;
            }
        }

    }

    public static void isimSoyisimHastaBul() {
        System.out.println("Bulmak istediginiz hastanin isim ve soyismi : ");
        String arananIsim = scan.nextLine();
        String arananSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> setHastalar = hastalar.entrySet();
        System.out.println("\t === HASTALAR ===\n" +
                "ID   ISIM      SOYISIM   HASTALIK");

        for (Map.Entry<String, String> each : setHastalar) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");
            if (arananIsim.equalsIgnoreCase(eachValueArr[0]) && arananSoyisim.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%-3s   %-7s    %-8s  %-15s", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2]);
            }
        }
    }

    public static void hastaListele() {
        Set<Map.Entry<String, String>> setHastalar = hastalar.entrySet();
        System.out.println("\t === HASTALAR ===\n" +
                "ID    ISIM       SOYISIM   HASTALIK");

        for (Map.Entry<String, String> each : setHastalar) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");
            System.out.printf("%-3s   %-7s    %-8s  %-15s\n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2]);
        }
    }

    public static void hastaEkle() {
        System.out.println("ID : ");
        String yeniID = scan.nextLine();
        System.out.println("ISIM : ");
        String yeniIsim = scan.nextLine();
        System.out.println("SOYISIM : ");
        String yeniSoyisim = scan.nextLine();
        System.out.println("HASTALIK : ");
        String yeniHastalik = scan.nextLine();
        String eklenecekHasta = yeniIsim + ", " + yeniSoyisim + ", " + yeniHastalik;
        hastalar.put(yeniID, eklenecekHasta);
    }

    public static void hastaSil() {
        System.out.print("Silmek istediginiz hastanin ID numarasi : ");
        String silID = scan.nextLine();
        String silinecekValue = hastalar.get(silID);
        String sonucValue = hastalar.remove(silID);
        boolean kontrol = silinecekValue.equalsIgnoreCase(sonucValue);
        if (kontrol) {
            System.out.println("Kayit silindi.");
        } else System.out.println("Bulunamadi.");
    }

    public static String acilHastaliklar() {

        StringBuilder str = new StringBuilder();
        List<String> acilHastaliklarListesi = new ArrayList<>(Arrays.asList("Kalp Hastaliklari", "Diabet", "Migren", "Böbrek Yetmezligi"));
        Set<Map.Entry<String, String>> setHastalar = hastalar.entrySet();

        for (Map.Entry<String, String> each : setHastalar) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split(", ");
            if (acilHastaliklarListesi.contains(eachValueArr[2])) {
                str.append("\nAGA SEN BITMISSIN! SEDYE LAZIM MI?" + "MEZARCI ILETISIM NUMARASI : 05054567847");
                break;
            } else {
                System.out.println("\nSEN BIZI DE MEZARA GÖMERSIN!");
                break;
            }

        }
        return str.toString();
    }
}

