import java.util.ArrayList;
import java.util.List;

public class ManavSepet {

    public List<Integer> sepetUrunNo = new ArrayList<>();

    public List<Double> sepetUrunMiktar = new ArrayList<>();

    public void sepeteEkle(int urunNO, double urunMiktari) {
        sepetUrunNo.add(urunNO);
        sepetUrunMiktar.add(urunMiktari);

    }

}

