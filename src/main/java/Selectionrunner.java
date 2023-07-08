import com.sun.jdi.Method;

import java.util.Scanner;

public class Selectionrunner {
    public static void main(String[] args) {
     //   MethodClass method = new MethodClass();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ogrenci sayisi giriniz");
        int ogrenciSayisi = scan.nextInt();
        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println("Spor merkezine hosgeldiniz " + (i + 1) + ". ogrenci bilgilerini giriniz");
            System.out.println("isim : ");
            String isim = scan.nextLine();
            scan.next();
            System.out.println("cinsiyet(kiz/erkek) :");
            String cinsiyet = scan.next();
            System.out.println("boy : ");
            double boy = scan.nextDouble();
            System.out.println("kilo : ");
            double kilo = scan.nextDouble();

        }
        System.out.println("Kursa Kayit yapabilen ogrenciler :");


    }


}
