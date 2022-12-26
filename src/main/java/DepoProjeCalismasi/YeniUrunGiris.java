package DepoProjeCalismasi;

import java.util.Scanner;
public class YeniUrunGiris {

    static Scanner input = new Scanner(System.in);
    public static void urunGirisi() {
        System.err.println(" # Urun Giris Sayfasi #");


        do {   // urun girisi yapabilmek icin kullanicidan bilgileri almamiz lazim
            yeniUrun();
            System.out.println("Urun eklemeye devam etmek icin 1'e \n Anasayfaya donmek icin herhangi bir tusa basiniz...");
            int secim = input.nextInt();

            if(secim==1){
                urunGirisi();  // urun girisi metodunu cagiriyoruz...
            }else {
                DepoKarsilama.depoKarsilamaSayfasi();
                break;
            }
        }while (true);
    }
    private static void yeniUrun() {  // yeni urun bilgilerini kullanicidan almak icin bir metolusturdum....
        System.out.println("Urunun Adini Giriniz : ");
        String urunAdi=input.nextLine();
        System.out.println("Uretici Firma Adini Giriniz :");
        String uretciFirma=input.nextLine();
        System.out.println("Birim Giriniz : ");
        String birim = input.nextLine();
        System.out.println("Raf bilgisini  giriniz : ");
        String rafIsmi=input.nextLine();
        System.out.println("Urun miktarini giriniz : ");
        int urunMiktarı=input.nextInt();

        UrunTanimlama urunObje= new UrunTanimlama(urunAdi,uretciFirma,birim,urunMiktarı,rafIsmi); // yeni bir urun olarak tanimladik
        UrunTanimlama.urunler.put(urunObje.getId(), urunObje); // urun tanimlama daki mep ime ekledim.
    }
}