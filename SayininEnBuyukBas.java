package sayininenbuyukbas;

import java.util.Scanner;

public class SayininEnBuyukBas {

    public static void main(String[] args) {
        //girilen sayının basamaklarındaki en büyük rakamı bulan program
        Scanner in = new Scanner(System.in);
        System.out.print("bir sayı gir: ");
        int sayi = Math.abs(in.nextInt()); // negatif sayılar için mutlak değer aldık yoksa 0 döner

        //sıfır girdisi için özel kontrol
        if (sayi == 0) {
            System.out.println("Girilen sayının en büyük bas. rakamı: 0");
            return;
        }
        int sonuc = 0;
        int enBuyuk = 0;
        while (sayi != 0) {
            sonuc = (sayi % 10);
            if (sonuc > enBuyuk) {
                enBuyuk = sonuc;
            }
            sayi /= 10;  //sağ taraftaki bas.ı sildi
        }
        System.out.println("Girilen sayının en büyük bas. rakamı:" + enBuyuk);

    }

}
