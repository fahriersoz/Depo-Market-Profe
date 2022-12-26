package DepoProjeCalismasi;

import java.util.Scanner;

public class DepoKarsilama extends DepoUrunListesi {  //Depo urun list. ile extends yaptik

    static Scanner input = new Scanner(System.in);

    public static void depoKarsilamaSayfasi() {

        System.err.println("\t\t\t\t#  DEPO ANASAYFA  #");
        System.out.println("----------------------------------------------");

        System.out.println(
                "\t\t\t\t1. Urun Giris\n" + " " +
                        "\t\t\t\t2. Urun Cikis\n" + " " +
                        "\t\t\t\t3. Urun Listesi\n" + " " +
                        "\t\t\t\t4. Cıkıs\n" +
                        "------------------------------------------------" +
                        "\nYapmak istediginiz islemin numarasini giriniz: ");


        int secim = input.nextInt();

        switch (secim) {
            case 1:
                new UrunGirisi();
                break;
            case 2:
                UrunCikis.urunCikisi();
                break;
            case 3:
                UrunListesi.urunListe();
                break;
            case 4:
                System.out.println("Çıkış Yaptınız!!!");
                System.exit(0);
                break;

            default:
                System.err.println("Gecerli Bir Secim Yapiniz !");
                depoKarsilamaSayfasi();
                break;

        }
    }
}