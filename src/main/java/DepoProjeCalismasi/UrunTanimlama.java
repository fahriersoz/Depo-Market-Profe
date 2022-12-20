package DepoProjeCalismasi;

import java.util.Map;
import java.util.Scanner;

public class UrunTanimlama {

    static Scanner input = new Scanner(System.in);
    static Map<Integer, UrunTanimlama> urunler = DepoUrunListesi.depodakiUrunler();
    // HashMap ile bir sinif olusturduk Uurun Id (Integer) ve UrunTanimlama (String) urunun bilgilerini aldik
    private String adi;
    private String uretici;
    private String birim;
    private static int id;
    public static int idIcınRakam = 221;
    private int miktar = 0;
    private String raf = null;

    protected UrunTanimlama() { // bos Contractor
    }

    public UrunTanimlama(String adi, String uretici, String birim, int miktar, String raf) {

        this.adi = adi;
        this.uretici = uretici;
        this.birim = birim;
        this.id = idIcınRakam;
        this.miktar = miktar;
        this.raf = raf;
        idIcınRakam++;
    }

    public static Object urunBilgileriAl() {  // musteri girisini burda tanimladik
        System.out.println("Urunun Adini Giriniz : ");
        String urunAdi = input.nextLine();
        System.out.println("Uretici Firma Adini Giriniz :");
        String uretciFirma = input.nextLine();
        System.out.println("Birim Giriniz : ");
        String birim = input.nextLine();
        System.out.println("Raf bilgisini  giriniz : ");
        String rafIsmi = input.nextLine();
        System.out.println("Urun miktarini giriniz : ");
        int urunMiktarı = input.nextInt();

        UrunTanimlama urun = new UrunTanimlama(urunAdi, uretciFirma, birim, urunMiktarı, rafIsmi); // olusturdugumuz nesneyi
        urunler.put(getId(), urun); //  mep`ime atadik

        do {    // kullanici surekli urun girinceye kadar donecek sonrada 2 girince Anasayfaya gonderecek
            System.out.println("Urun Eklemeye devam etmek icin 1'e \nAnasayfaya donmek icin 2'ye basiniz");
            int secim = input.nextInt();  // sikinti olursa String yapmam lazim
            if (secim == 1) {  // ekuls
                urunBilgileriAl();  // Urun girerken bir ust yukaridaki metodu buraya koyduk ki surekli donerken kullansin
                break;
            } else if (secim == 2) {
                DepoKarsilama.depoKarsilamaSayfasi();
                break;
            } else {
                System.out.println("Yanlis bir secim yaptiniz");
            }
        } while (true);
        return urun;
    }

    public static Map<Integer, UrunTanimlama> urunListesiOlustur() {

        return urunler;
    }
    
    public static Integer getId() {

        return id;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    @Override
    public String toString() {

        return "\t\t\t" + adi + "\t\t\t\t" + uretici + "\t\t\t" + birim + "\t\t" + raf + "\t\t\t" + miktar;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }
}