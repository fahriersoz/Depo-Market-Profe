package DepoProjeCalismasi;

import java.util.Scanner;

public class UrunGirisi {

    public UrunGirisi() {
        Scanner input = new Scanner(System.in);
        boolean dogruSecim =false;
        do {
            System.out.println("Yeni urun giris icin \"1\" Rafa urun eklemek icin \"2\" ye basiniz");
            int secim = input.nextInt();
            if (secim == 1) {
                YeniUrunGiris.urunGirisi();
            } else if (secim == 2) {
                RafaUrunKoyma.urunRafaKoy();
            } else {
                System.out.println("Yanlis secim yaptiniz");
                dogruSecim = true;
            }

        } while (dogruSecim);
    }
}
