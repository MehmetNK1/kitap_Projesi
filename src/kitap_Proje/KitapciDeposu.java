package kitap_Proje;

public class KitapciDeposu {

    //public String kitapFiyatı;
    private String kitapAdi;
    private int kitapNo;
    private String yazarAdi;
    private int kitapFiyat;

    public KitapciDeposu() {
    }

    public KitapciDeposu(String kitapAdi, int kitapNo, String yazarAdi, int kitapFiyat) {
        this.kitapAdi = kitapAdi;
        this.kitapNo = kitapNo;
        this.yazarAdi = yazarAdi;
        this.kitapFiyat = kitapFiyat;
    }

    public String getKitapAdi() {
        return this.kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public int getKitapNo() {
        return this.kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getYazarAdi() {
        return this.yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getKitapFiyat() {
        return this.kitapFiyat;
    }

    public void setKitapFiyat(int kitapFiyat) {
        this.kitapFiyat = kitapFiyat;
    }

    @Override
    public String toString() {
        return "KitapciDeposu{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapNo=" + kitapNo +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapFiyat=" + kitapFiyat +
                '}';
    }
}
