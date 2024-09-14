package sayibasamaktoplami;

import java.util.Scanner;

public class SayiBasamakToplami {

    public static void main(String[] args) {
        //girilen bi sayının rakamlarının toplamını yazdıran kod
        Scanner in = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int sayi = in.nextInt();
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10; //sayının son basamağını toplama ekler
            sayi /= 10; //Sayının son bas.nı kaldırır      
        }
        System.out.println("Rakamların toplamı: " + toplam);
    }

}
