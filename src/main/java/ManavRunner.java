import java.util.List;
import java.util.Scanner;

public class ManavRunner {

    public static void main(String[] args) {
        int urunNo;
        double urunMiktar;
        char kontrol;
        Scanner scanner = new Scanner(System.in);
        ManavUrun urun = new ManavUrun();
        ManavSepet sepet = new ManavSepet();
        urun.urunload();
        urun.urunList();

        do {

            sepet.sepeteEkle(urun.urunSec(), urun.miktarSec());
            System.out.print("Devam Etmek istiyormusunuz E/H : ");
            kontrol = scanner.next().charAt(0);
            if (kontrol == 'H' || kontrol == 'h') break;
        } while (true); //


     faturaYazdir(sepet.sepetUrunNo,sepet.sepetUrunMiktar,urun.urun,urun.fiyat);




    }

    private static void faturaYazdir(List<Integer> sepetUrunNo, List<Double> sepetUrunMiktar, List<String> urun, List<Double> fiyat) {
        double aratoplam ,toplamTutar = 0;
        System.out.println("No:\t\tÜrün Adı \t\tMiktarı  \t\tBirim Fiyatı  \t\tToplam Fiyat");
        System.out.println("**************************************************************************");

        for (int i = 0; i < sepetUrunNo.size(); i++) {
            aratoplam=fiyat.get(i)*sepetUrunMiktar.get(i);
            System.out.println(i+1+"\t\t"+urun.get(i)+"\t\t\t"+sepetUrunMiktar.get(i)+
                    "\t\t\t\t"+fiyat.get(i)
                    +"\t\t\t\t\t"+aratoplam);
            toplamTutar+=aratoplam;

        }

        System.out.println("**************************************************************************");
        System.out.println("Toplam Ödenecek Tutar : \t\t\t\t\t\t\t\t\t "+toplamTutar);



    }


}

