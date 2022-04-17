package kitap_Proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {

    static List<KitapciDeposu> kitapListesi = new ArrayList();
    static Scanner scan=new Scanner(System.in);
    static int kitapSayac=0;



    public static void anaMenu() {
        System.out.println("     ===============================\n\t " +
                "Q10 kITAP CENTER'A HOSGELDINIZ " +
                "\n\t====================================" +
                "\n============= İŞLEMLER =============\r\n     " +
                "1-KITAP EKLEME \r\n    " +
                " 2-NUMARA ILE KITAP ARAMA\r\n     " +
                "3-BILGI ILE KITAP ARAMA \r\n     " +
                "4-NUMARA ILE SİLME\r\n     " +
                "5-KITAP LISTELEME\r\n     " +
                "6-CIKIS");
        System.out.print("bir islem seciniz : ");
        int tercih = scan.nextInt();
        switch(tercih) {
            case 1:
                kitapEkle();
                anaMenu();
                break;
            case 2:
                numaraIleKitap();
                anaMenu();
                break;
            case 3:
                bilgiIleKitap();
                anaMenu();
                break;
            case 4:
                numaraIleSil();
                anaMenu();
                break;
            case 5:
                kitapListele();
                anaMenu();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("hatali giris");
                anaMenu();
        }

    }

    private static void kitapEkle() {//

        System.out.print("kitap adi :");
        scan.nextLine();// dummy art arda olan scanlarde ilk sout altina
        String kitapAdi=scan.nextLine();
        System.out.print("yazar adi :");
        String yazarAdi=scan.nextLine();
        System.out.print("fiyat :");
        int kitapFiyat=scan.nextInt();
        int kitapNo=1000+kitapSayac;
        kitapSayac++;
        KitapciDeposu yeniKitap = new KitapciDeposu(kitapAdi,kitapNo,yazarAdi,kitapFiyat);
        kitapListesi.add(yeniKitap);
        System.out.print("eklemeye devam icin 1'e bas , Ana menu icin 0'a bas..: ");
        int tercih = 0;
        tercih=scan.nextInt();
            if (tercih == 1) {
            kitapEkle();
        }
            else if (tercih == 0) {
              anaMenu();
            }
            else {
                System.out.println("hatali giris..");
        }
    }
    private static void numaraIleKitap() {//

            System.out.println("kitabın nosunu gir..");

            int tercih1=scan.nextInt();
            boolean varmi = true;

            for (int i = 0; i <kitapListesi.size() ; i++) {

                if(kitapListesi.get(i).getKitapNo() ==tercih1) {

                    System.out.println("Kitap adı: " + kitapListesi.get(i).getKitapAdi());
                    System.out.println("Kitap Yazarı: " + kitapListesi.get(i).getYazarAdi());
                    System.out.println("Kitap fiyatı: " + kitapListesi.get(i).getKitapFiyat());
                    varmi = false;
                }
                }if(varmi==true){
                    System.out.println("yanlis yada yok ...");
                }
            System.out.print("aramaya devam icin 1'e bas , Ana menu icin 0'a bas..: ");
            int tercih = 0;
            tercih=scan.nextInt();
            if (tercih == 1) {
                numaraIleKitap();
            }
            else if (tercih == 0) {
                anaMenu();
            }
            else {
                System.out.println("hatali giris..");
            }
    }
    private static void bilgiIleKitap() {//
        System.out.println("kitap adi ile ara 1'e bas , yazar adi ile ara 2'ye bas , fiyat ile ara 3'e bas ..");
        int tercih = 0;
        tercih=scan.nextInt();
        switch (tercih) {
            case 1: {
                scan.nextLine();
                System.out.print("kitap adi gir : ");
                String kitap = scan.nextLine();
                boolean varmi = false;
                for (int i = 0; i < kitapListesi.size(); i++) {
                    if (kitapListesi.get(i).getKitapAdi().equalsIgnoreCase(kitap)) {
                        System.out.println("Kitap No : " + kitapListesi.get(i).getKitapNo() + " ");
                        System.out.println("Kitap Adi : " + kitapListesi.get(i).getKitapAdi() + " ");
                        System.out.println("Yazar Adi : " + kitapListesi.get(i).getYazarAdi() + " ");
                        System.out.println("Fiyat : " + kitapListesi.get(i).getKitapFiyat() + " ");
                        varmi = true;
                    }
                }
                if (varmi = false) {
                    System.out.println("yanlis yada yok ...");
                }
            }
                System.out.print("aramaya devam icin 1'e bas , Ana menu icin 0'a bas..: ");
                int tercih1 = 0;

                tercih1=scan.nextInt();

                if (tercih1 == 1) {
                    bilgiIleKitap();
                }
                else if (tercih1 == 0) {
                    anaMenu();
                }
                else {
                    System.out.println("hatali giris..");
                }
            case 2:{
                scan.nextLine();
                System.out.print("yazar adi gir : ");
                String yazar = scan.nextLine();
                boolean varmi = false;
                for (int i = 0; i < kitapListesi.size(); i++) {
                    if (kitapListesi.get(i).getYazarAdi().equalsIgnoreCase(yazar)) {
                        System.out.println("Kitap No : " + kitapListesi.get(i).getKitapNo() + " ");
                        System.out.println("Kitap Adi : " + kitapListesi.get(i).getKitapAdi() + " ");
                        System.out.println("Yazar Adi : " + kitapListesi.get(i).getYazarAdi() + " ");
                        System.out.println("Fiyat : " + kitapListesi.get(i).getKitapFiyat() + " ");
                        varmi = true;
                    }
                }
                if (varmi = false) {
                    System.out.println("yanlis yada yok ...");
                }
            }
            System.out.print("aramaya devam icin 1'e bas , Ana menu icin 0'a bas..: ");
            int tercih2 = 0;
            tercih2=scan.nextInt();
            if (tercih2 == 1) {
                bilgiIleKitap();
            }
            else if (tercih2 == 0) {
                anaMenu();
            }
            else {
                System.out.println("hatali giris..");
            }
            case 3: {
                scan.nextLine();
                System.out.print("Fiyat gir .. :");
                int fiyat1 = scan.nextInt();
                boolean varmi = false;
                for (int i = 0; i < kitapListesi.size(); i++){
                    if (kitapListesi.get(i).getKitapFiyat()==fiyat1){
                        System.out.println("Kitap No : " + kitapListesi.get(i).getKitapNo() + " ");
                        System.out.println("Kitap Adi : " + kitapListesi.get(i).getKitapAdi() + " ");
                        System.out.println("Yazar Adi : " + kitapListesi.get(i).getYazarAdi() + " ");
                        System.out.println("Fiyat : " + kitapListesi.get(i).getKitapFiyat() + " ");
                        varmi = true;
                    }
                }
                if (varmi = false){
                    System.out.println("yanlis yada yok..");
                }
            }
            System.out.print("aramaya deva meetmek icin 1'e bas, ana menu icin 0'a bas ..:");
            int tercih3=0;
            tercih3=scan.nextInt();
            if (tercih3 == 1){
                bilgiIleKitap();
            }
            else if (tercih3 == 0){
                anaMenu();
            }
            else{
                System.out.println("hatali girdin...");
            }
        }
    }
    private static void numaraIleSil() {//
        /*
        boolean islem=true;
        Scanner scan = new Scanner(System.in);

        System.out.println("silinecek kitap no giriniz:");
        int silinecekkitapNo = 0;
        while (true){
            try {
                silinecekkitapNo = scan.nextInt();
                if (silinecekkitapNo<1000){
                    System.out.println("1000 den buyuk sayi giriniz");
                    break;
                }
            } catch (Exception e) {
                // e.printStackTrace();
                String str=scan.nextLine();
                System.out.println("hatali veri girdiniz");
            }
        }
        for (int i = 0; i < kitapListesi.size(); i++) {
            if (silinecekkitapNo==kitapListesi.get(i).getKitapNo()) {
                kitapListesi.remove(kitapListesi.get(i));
                System.out.println("Silme İşlemi Başarılı.");
                islem=true;
            }
        }
        if (islem==false) {
            System.out.println("silmek için Geçerli bir veri girin");
        }
}

         */

        System.out.print("silinecek no gir.. : ");
        int silinecek = scan.nextInt();
        for (int i = 0; i < kitapListesi.size();i++){
            if (silinecek==kitapListesi.get(i).getKitapNo()){
                System.out.println("aranan bulundu ve silinecek..");
                System.out.println("emin misin E / H ");
                char karar= scan.next().charAt(0);
                if (karar=='E'|| karar=='e'){
                    kitapListesi.remove(kitapListesi.get(i));
                    System.out.println("hadi gecmis olsun...");
                }else{
                    System.out.println("silme iptal..");
                }
            }
        }
    }


    private static void kitapListele()   {//
        System.out.println("eldeki kitaplar ...");
        for (int i=0; i< kitapListesi.size() ; i++){
            System.out.println("Kitap no : " + kitapListesi.get(i).getKitapNo()+ " ");
            System.out.println("Kitap adı: " + kitapListesi.get(i).getKitapAdi()+ " ");
            System.out.println("Kitap Yazarı: " + kitapListesi.get(i).getYazarAdi()+ " ");
            System.out.println("Kitap fiyatı: " + kitapListesi.get(i).getKitapFiyat()+ " ");

        }
       // Thread.sleep(5000);
       // anaMenu();

    }
    private static void cikis() {
        System.out.println("Bizi tercih ettiginiz tesekkur ederiz.");
    }

}
