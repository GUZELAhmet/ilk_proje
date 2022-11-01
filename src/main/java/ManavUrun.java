import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavUrun {
    public List<String> urun = new ArrayList<String>();

    public List<Double> fiyat = new ArrayList<Double>();
    public Scanner scanner = new Scanner(System.in);

    public void urunload() {

            urun.add("Elma");
            urun.add("Armut");
            urun.add("Patetes");
            urun.add("Soğan");
            urun.add("Domates");

            fiyat.add(2.2);
            fiyat.add(3.5);
            fiyat.add(2.2);
            fiyat.add(2.4);
            fiyat.add(3.1);
             }
    public void yeniUrungir() {
        char control;
        do {
            System.out.println("ürün adı giriniz");
            urun.add(scanner.nextLine());
            System.out.println("ürün Kg fiyatını giriniz");
            fiyat.add(scanner.nextDouble());
            System.out.println("Eklemek istediğiniz başka  ürün varmı? E/H");
            control = scanner.nextLine().charAt(0);
            if (control == 'H' || control == 'h') break;

        } while (true);


    }

    public void urunList() {
        System.out.println("No:\t\tÜrün Adı \t\t Fiyatı");
        System.out.println("**************************************");
        for (int i = 0; i <urun.size(); i++) {
            System.out.println(i+1+"\t\t"+urun.get(i)+"\t\t\t"+fiyat.get(i));
        }
    }
    public int urunSec(){
        int urunNo=0;
        System.out.print("Almak istediğiniz ürün numarasınını giriniz : ");
        urunNo = scanner.nextInt();
        if (urunNo>urun.size()){
            System.out.print("Ürün numarasını 1-"+urun.size()+" arasında giriniz : ");
            urunNo = scanner.nextInt();
        }

        return urunNo;
    }

    public double miktarSec(){
        double urunMiktar;
        System.out.print("Almak istediğiniz ürün miktarını giriniz : ");
        urunMiktar = scanner.nextDouble();
        return  urunMiktar;
    }
}
