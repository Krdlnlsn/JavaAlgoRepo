package ıkiyeuclukmatris;

import java.util.Random;

public class IkiyeUclukMatris {

    public static void main(String[] args) {
        //2*3lük matris yapımı
        Random rand = new Random();
        int[][] dizi = new int[2][3];
        for (int i = 0; i < 2; i++) {
            System.out.print("__   __   __\n");
            for (int j = 0; j < 3; j++) {
                dizi[i][j] = rand.nextInt(100);
                if (dizi[i][j] < 10) {
                    System.out.print(dizi[i][j] + "  | ");
                } else {
                    System.out.print(dizi[i][j] + " | ");
                }
            }
            System.out.println();
            System.out.print("__ | __ | __ |\n");
        }
    }
}
