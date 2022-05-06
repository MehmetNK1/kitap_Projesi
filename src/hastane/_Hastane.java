package hastane;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static hastane._Hasta.acilHastaliklar;

public class _Hastane {
    static Scanner scan = new Scanner(System.in);
    public static void anaMenü() {

        String secim = "";
        do {
            System.out.println("\n\t === DILEK HASTANESI ===\t\n" +
                    "1-ID ILE DURUM BILGISI\n" +
                    "2-ISIM VE SOYISIM ILE HASTA BULMA\n" +
                    "3-HASTA LISTESI\n" +
                    "4-DOKTOR LISTESI \n" +
                    "5-UNVAN ILE DOKTOR BULMA\n" +
                    "6-HASTA EKLEME\n" +
                    "7-HASTAYI ID ILE SILME\n" +
                    "8-DURUM SORGULAMA\n" +
                    "Q-CIKIS");


            System.out.print("Yapmak istediginiz islemi seciniz : ");
            secim = scan.nextLine();

            switch (secim) {
                case "1":
                    _Hasta.idIleDurumBilgisiBul();
                    break;
                case "2":
                    _Hasta.isimSoyisimHastaBul();
                    System.out.println(_Hasta.acilHastaliklar());
                    break;
                case "3":
                    _Hasta.hastaListele();
                    break;
                case "4":
                    _Doktor.doktorListele();
                    break;
                case "5":
                    _Doktor.unvanIleDoktorBul();
                    break;
                case "6":
                    _Hasta.hastaEkle();
                    break;
                case "7":
                    _Hasta.hastaSil();
                    break;
                case "8":
                   // _Hasta.durumSorgula();
                    break;
                case "q":
                case "Q":
                    cikisYap1();
                    break;
            }
        } while (!secim.equalsIgnoreCase("Q"));


    }

    private static void cikisYap1() {
        System.out.println("DILEK HASTANESINI TERCIH ETTIGINIZ ICIN TESEKKÜR EDERIZ");
        //System.exit(0); --> Kullanilabilir
    }


}
