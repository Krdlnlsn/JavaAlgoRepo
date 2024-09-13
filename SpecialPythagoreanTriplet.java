package specialpythagoreantriplet;

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        /*A Pythagorean triplet is a set of three natural numbers, a<b<c, for which,
                        a^2 + b^2 = c^2.
        For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        Find the product abc.*/
        /*Bir Pisagor üçlüsü, a^2 + b^2 = c^2 olan a<b<c üç doğal sayı kümesidir.
        Örneğin, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
        a + b + c = 1000 olan tam bir Pisagor üçlüsü vardır. abc çarpımını bulun. */

        int sonuc = 0;
        String sonuc1 = " ";
        for (int i = 3; i < 1000; i++) {
            for (int j = 4; j < 1000; j++) {
                double k = Math.pow(i, 2) + Math.pow(j, 2);
                if (Math.sqrt(k) == (int) Math.sqrt(k) && i + j + (int) Math.sqrt(k) == 1000) {
                    sonuc1 = String.valueOf(j) + "^2 + " + String.valueOf(i) + "^2 = " + String.valueOf((int) Math.sqrt(k) + "^2");
                    sonuc = i * j * (int) Math.sqrt(k);
                }
            }
        }
        System.out.println(sonuc1 + "\n200*375*425 =  " + sonuc);

    }
}
