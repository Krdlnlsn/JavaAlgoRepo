package dizielemanesitligi;

import java.util.Random;

public class DiziElemanEsitligi {

    public static void main(String[] args) {
        /*1) İki dizinin elemanlarının ve sıralarının eşitliğini test eden bir Java programı yazınız.
              Örnek
              Dizi1: 3 4 7 8 9
              Dizi2: 3 4 7 8 9
              Çıktı: Dizi1 ve Dizi2 birbirine eşittir.*/
        Random rand = new Random();
        int[] dizi1 = new int[5];
        int[] dizi2 = new int[5];
        int benzerlik = 0;
        System.out.print("Dizi1: ");
        for (int i = 0; i < 5; i++) {
            dizi1[i] = rand.nextInt(10);
            System.out.print(dizi1[i] + " ");
        }
        System.out.print("\nDizi2: ");
        for (int i = 0; i < 5; i++) {
            dizi2[i] = rand.nextInt(10);
            System.out.print(dizi2[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            if (dizi1[i] == dizi2[i]) {
                benzerlik += 20;
            }
        }
        System.out.println("\nBenzerlik oranı: %" + benzerlik);
    }
}