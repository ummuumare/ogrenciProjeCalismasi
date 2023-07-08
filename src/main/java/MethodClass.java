import java.util.ArrayList;
import java.util.List;

public class MethodClass {
    public static List<Ogrenci> eklenenOgrenciler = new ArrayList<>();

    public void ogrenciSelection(String isim, String cinsiyet, double kilo, double boy) {
        if (cinsiyet.equalsIgnoreCase("kiz")) {
            if (boy >= 1.60 && boy <= 180 && kilo <= 60) {
                Ogrenci ogrenci = new Ogrenci(isim, cinsiyet, boy, kilo);
                eklenenOgrenciler.add(ogrenci);
            }
        } else if (cinsiyet.equalsIgnoreCase("erkek")) {
            if (boy >= 1.65 && boy <= 1.85 && kilo <= 70) {
                Ogrenci ogrenci = new Ogrenci(isim, cinsiyet, boy, kilo);
                eklenenOgrenciler.add(ogrenci);
            }
        }
    }

    public void ogrenciListeleme() {
        System.out.printf("%-15s %-15s %-10s %-10s", "|Isim|", "|Cinsiyet|", "|Kilo|", "|Boy|");
        System.out.println("\n************************************************");
        for (Ogrenci w : eklenenOgrenciler) {
            System.out.printf("%-15s %-15s %-10s %-10s", w.getIsim(), w.getCinsiyet(), w.getCinsiyet(), w.getBoy());
            System.out.println();
        }
    }
}