package DepoProjeCalismasi;

import java.util.HashMap;
import java.util.Map;

public class DepoUrunListesi {
    private static Map<Integer, UrunTanimlama> urunler = new HashMap<>();

    // urunler diye bir konteynir olusturdum. Ki id ve valio olarakta UrunTanimlama
    // id urunun tipini tutuyor
    protected static Map<Integer, UrunTanimlama> depodakiUrunler() {

        UrunTanimlama urun = new UrunTanimlama("E5", "Samsung", "Cep Telefonu", 10, "Tuslu Telefon");
        urunler.put(100, urun);

        UrunTanimlama urun1 = new UrunTanimlama("S9", "Samsung", "Cep Telefonu", 10, "Akıllı Telefon");
        urunler.put(101, urun1);

        UrunTanimlama urun2 = new UrunTanimlama("Oppo s152", "Oppo", "Telefon Aksesuarlari", 10, "Batarya");
        urunler.put(102, urun2);

        UrunTanimlama urun3 = new UrunTanimlama("samsung s5 Kılıf", "Samsung", "Cep Telefonu", 20, "Telefon Kılıfları");
        urunler.put(103, urun3);

        UrunTanimlama urun4 = new UrunTanimlama("Galaxy Tab S8 Ultra", "Samsung", "Tablet", 3, "Tablet");
        urunler.put(104, urun4);

        UrunTanimlama urun5 = new UrunTanimlama("Samsung Tab S8 Ultra Kılıf", "Samsung", "Tablet", 8, "Tablet Kılıfları");
        urunler.put(105, urun5);

        UrunTanimlama urun6 = new UrunTanimlama("Xbs 150", "Samsung", "Cep Telefonu", 30, "Telefon Kulaklıgı");
        urunler.put(106, urun6);

        UrunTanimlama urun7 = new UrunTanimlama("Xbs 10 pro", "Samsung", "Tablet", 30, "Tablet Kulaklıgı");
        urunler.put(107, urun7);

        return urunler;
    }

    public static Map<Integer, UrunTanimlama> getUrunler() {
        return urunler;
    }
}