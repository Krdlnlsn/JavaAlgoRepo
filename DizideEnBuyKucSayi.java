package dizideenbuykucsayi;

import java.util.Random;

public class DizideEnBuyKucSayi {

    public static void main(String[] args) {
        //bir dizi içerisindeki en büyük ve en küçük sayıyı ve yerini bulduran kod
        Random rand = new Random();
        int[] dizi = new int[5];
        int buyuk = 0, kucuk = 101;
        int kucukSayac = 0, buyukSayac = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanı: " + (dizi[i] = rand.nextInt(101)));
            if (dizi[i] > buyuk) {
                buyuk = dizi[i];
                buyukSayac = i + 1;
            }
            if (dizi[i] < kucuk) {
                kucuk = dizi[i];
                kucukSayac = i + 1;
            }
        }
        System.out.println(kucuk + " en küçük elemandır. " + kucukSayac + ". sıradadır.\n" + buyuk + " en büyük elamandır. " + buyukSayac + ". sıradadır.");
    }

}
