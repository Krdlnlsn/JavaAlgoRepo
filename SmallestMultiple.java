package smallestmultiple;

public class SmallestMultiple {

    public static void main(String[] args) {
        /*2520 is the smallest number that can be divided by each of the numbers 
        from 1 to 10 without any remainder. What is the smallest positive number
        that is evenly divisible by all of the numbers from 1 to 20?*/
        /*2520, 1'den 10'a kadar olan sayıların her birine kalansız bölünebilen en küçük sayıdır.
        1'den 20'ye kadar olan tüm sayılara eşit olarak bölünebilen en küçük pozitif sayı nedir?*/

        int enKucuk = Integer.MAX_VALUE;
        for (int i = 10; i < enKucuk; i++) {
            int sayim = 0;
            int sayi = i;
            for (int j = 1; j <= 20; j++) {
                if (sayi % j == 0) {
                    sayim++;
                    if (sayim == 20 && enKucuk > sayi) {
                        enKucuk = sayi;
                        System.out.println(sayi);
                    }
                }
            }
        }

    }
}
