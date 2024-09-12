package sumsquaredifference;

public class SumSquareDifference {

    public static void main(String[] args) {
        /*The sum of the squares of the first ten natural numbers is,
              1^2 + 2^2 + .. + 10^2 = 385
        The square of the sum of the first ten natural numbers is,
              (1 + 2 + .. + 10)^2 = 55^2 = 3025
        Hence the difference between the sum of the squares of the first ten natural
        numbers and the square of the sum is 3025-385=2640 
        Find the difference between the sum of the squares of 
        the first one hundred natural numbers and the square of the sum.*/
        /*İlk on doğal sayının karelerinin toplamı, 1^2 + 2^2 + ... + 10^2 = 385'tir.
        İlk on doğal sayının toplamının karesi, (1 + 2 + .. + 10)^2 = 55^2 = 3025'tir.
        Dolayısıyla, ilk on doğal sayının karelerinin toplamı ile toplamın karesi arasındaki fark 3025-385=2640'tır.
        İlk yüz doğal sayının karelerinin toplamı ile toplamın karesi arasındaki farkı bulunuz.*/
        
        long kareToplam=0;
        long toplam=0;
        for (long i = 1; i <=100; i++) {
            kareToplam+=Math.pow(i, 2);
            toplam+=i;
        }
        System.out.println("Kareleri toplamı: "+kareToplam+"\nToplamının karesi: "
                +(long)Math.pow(toplam, 2)+"\nArasındaki fark: "+Math.abs(kareToplam-((long)Math.pow(toplam, 2))));
    }
}
