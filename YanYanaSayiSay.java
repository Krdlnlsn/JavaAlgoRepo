package yanyanasayisay;

import java.util.Scanner;

public class YanYanaSayiSay {

    public static void main(String[] args) {
        /*1.)Bir tam sayı dizisinde yan yana olan iki 5'in sayısını sayan programı yaz.
      Örnek: {5,5,2} -->1  {5,5,2,5,5} --> 2   {5,6,2,9} -->0 gibisinden*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int elemanSayisi = scan.nextInt();
        int[] dizi = new int[elemanSayisi];
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
        }
        System.out.println("Yan yana bulunan 5'lerin sayısı: " + say(dizi));
    }

    public static int say(int[] dizi) {
        int sayac = 0;
        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] == 5 && dizi[i + 1] == 5) {
                sayac++;
            }
        }
        return sayac;
    }
}
