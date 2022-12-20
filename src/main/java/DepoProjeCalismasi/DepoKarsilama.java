package DepoProjeCalismasi;

import java.util.Scanner;

public class DepoKarsilama extends DepoUrunListesi{  //Depo urun list. ile extends yaptik

    static Scanner input = new Scanner(System.in);

    public static void depoKarsilamaSayfasi() {

//        System.err.println("\t\t\t\t\t#  DEPO ANASAYFA  #");
//        System.out.println("-------------------------------------------------------------");
//
//        System.out.println("||============ DEPO ANASAYFA ===============||");
//        System.out.println(" 1. Urun Tanimlama\n" + " " +
//                "2. Urun Rafa Koy\n" + " " +
//                "3. Urun Giris\n" + " " +
//                "4. Urun Cikis\n" + " " +
//                "5. Urun Listesi\n" + " " +
//                "6. Cıkıs\n" + "Yapmak istediginiz islemin numarasini giriniz: ");
//        System.out.println("------------------------------------------------");
//
//        System.out.println("========================== İŞLEMLER =======================\r\n"
//                + "   ____________________             ____________________    \n"
//                + "   | 1-URUN TANIMLAMA  |            | 2-URUN RAFA KOY|      \n"
//                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
//                + "   ____________________             ____________________    \n"
//                + "   | 3-URUN GIRISI     |            | 4-URUN CIKISI     |   \n"
//                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
//                + "   ____________________             ____________________    \n"
//                + "   | 5-URUN LİSTESİ    |            | 6-CIKIS           |   \n"
//                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       ");
//
        int secim = input.nextInt();

        switch (secim) {
            case 1:
                UrunTanimlama.urunBilgileriAl();
                break;
            case 2:
                RafaUrunKoyma.urunRafaKoy();
                break;
            case 3:
                YeniUrunGiris.urunGirisi();
                break;
            case 4:
                UrunCikis.urunCikisi();
                break;
            case 5:
                UrunListesi.urunListe();
                break;
            case 6:
                System.exit(0);
            default:
                System.err.println("Gecerli Bir Secim Yapiniz !");
                depoKarsilamaSayfasi();
                break;

        }
    }
}
