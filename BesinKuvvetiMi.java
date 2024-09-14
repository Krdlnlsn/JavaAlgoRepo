package besinkuvvetimi;

import java.util.Scanner;

public class BesinKuvvetiMi {

    public static void main(String[] args) {
        //herhangi bir sayı 5'in herhangi bir kuvveti mi
        Scanner in = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = in.nextInt();
        int sonuc = 1;

        while (sonuc < sayi) {
            sonuc *= 5;
        }

        if (sonuc == sayi) {
            System.out.println("5'in kuvvetidir");
        } else {
            System.out.println("5'in kuvveti değildir");
        }
        /*Kullanıcı 30 girdiğinde:
        sonuc başlangıçta 1.
        Döngü: 1 * 5 = 5, 5 * 5 = 25, 25 * 5 = 125
        sonuc artık 125 ve sayi ile eşleşmiyor.
        Çıktı: "5'in kuvveti değildir"*/
    }

}
