package DepoProjeCalismasi;

import java.util.Scanner;
import java.util.Set;

public class RafaUrunKoyma {

    static Set<Integer> urunId = UrunTanimlama.urunler.keySet();  // urunleri tuttugum bir Set`im var. Key degerlerini aldim Setin icine koydum
    static Scanner input = new Scanner(System.in);

    public static void urunRafaKoy() {
        System.err.println(" # Urun Rafa Koyma Sayfasi #");

        System.out.println("Id Numarasi Giriniz : ");
        int id = input.nextInt();

        UrunTanimlama obje = UrunTanimlama.urunler.get(id); // objemizi olusuturduk

        do {
            if (urunId.contains(id)) {
                rafaUrunKoyma(obje);
                System.out.println("Rafa Koymaya devam etmek icin 1'e \n Anasayfaya donmek icin herhangi bir tusa basiniz...");
                int secim = input.nextInt();

                if (secim == 1) {
                    urunRafaKoy();
                } else {
                    DepoKarsilama.depoKarsilamaSayfasi();
                }

            } else {
                System.out.println("Olmayan id Girdiniz, Lütfen tekrar id giriniz = ");
                id = input.nextInt();
            }
        } while (true);
    }

    private static void rafaUrunKoyma(UrunTanimlama obje) {  // yeni gelen urunude girerse
        System.out.println("Eklemek istediginiz miktari giriniz : ");
        int miktar = input.nextInt();
        obje.setMiktar(obje.getMiktar() + miktar); // kullanicinin girdigi miktar ve onceki miktarin uzerine ekliyoruz
    }

}