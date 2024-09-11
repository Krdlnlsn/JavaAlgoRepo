package largestpalindromeproduct;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        /*A palindromic number reads the same both ways. 
        The largest palindrome made from the product of two 2-digit numbers is
        9009=91*99. Find the largest palindrome made from the product of two 3-digit numbers.*/
        /*Palindromik bir sayı her iki şekilde de aynı okunur.
        İki 2 basamaklı sayının çarpımından oluşan en büyük palindrom 9009=91*99'dur.
        İki 3 basamaklı sayının çarpımından oluşan en büyük palindromu bulunuz.*/

        int enBuyuk = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {

                int sayi = i * j;   //tersten yazdırdım
                int sayi1 = i * j;
                int sayi2 = i * j;
                int kacBasamak = 0;
                while (sayi / 10 != 0) {
                    kacBasamak++;
                    sayi /= 10;
                }

                int sonuc = 0;
                while (sayi1 / 10 != 0) {
                    int kalan = sayi1 % 10;
                    sonuc = (int) (sonuc + (kalan * Math.pow(10, kacBasamak)));
                    kacBasamak--;
                    sayi1 /= 10;
                }
                sonuc += sayi1;

                if (sonuc == sayi2) {
                    if (sonuc > enBuyuk) {
                        enBuyuk = sonuc;
                    }
                    System.out.println(i + "*" + j + "=" + sayi2 + " - Bu sayı palindrom sayıdır.");
                }
            }
        }
        System.out.println("\nİki 3 basamaklı sayının çarpımından oluşan en büyük palindrom: " + enBuyuk);
    }
}
