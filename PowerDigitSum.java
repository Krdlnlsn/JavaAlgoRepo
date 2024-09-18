package powerdigitsum;

import java.math.BigInteger;

public class PowerDigitSum {

    public static void main(String[] args) {
        /* 2^15 = 32768 and the sum of its digits is 3+2+7+6+8 = 26.
        What is the sum of the digits of the number  2^1000 ? */
        /*2^15 = 32768 ve rakamlarının toplamı 3+2+7+6+8 = 26'dır.
        2^1000 sayısının rakamlarının toplamı nedir?*/

        BigInteger sayi = BigInteger.valueOf(2).pow(1000);
        System.out.println("2^1000 = " + sayi);
        boolean kontrol = true;
        BigInteger toplam = BigInteger.ZERO;
        while (kontrol) {
            // 10'dan büyükse. Küçük olup da if döngüsüne girerse kalan 0 olur...
            if (sayi.compareTo(BigInteger.TEN) >= 0) {
                BigInteger[] sonuc = sayi.divideAndRemainder(BigInteger.TEN);
                BigInteger kalan = sonuc[1]; 
                // System.out.print(kalan + "+");
                toplam = toplam.add(kalan);
                sayi = sonuc[0]; 
                // Sayi 10'dan küçük ve ekleyip döngüyü bitiriyoruz.
            } else {
                // System.out.print(sayi + " = ");
                toplam = toplam.add(sayi);
                kontrol = false;
            }
        }
        System.out.println(toplam);

//        long sayi = (long) Math.pow(2, 100);
//        System.out.println("2^15 = " + sayi);
//        boolean kontrol = true;
//        long toplam = 0;
//        while (kontrol) {
//            if (sayi > 10) {
//                long kalan = sayi % 10;
//                System.out.print(kalan + "+");
//                toplam += kalan;
//                sayi /= 10;
//            }
//            if (sayi < 10) {
//                System.out.print(sayi + " = ");
//                toplam += sayi;
//                kontrol = false;
//            }
//        }
//        System.out.println(toplam); 

/*Bu benim yazdığım kod, teknik olarak doğru fakat çıkan sonuc long değişken türünden daha da 
büyük olduğu için BigInteger değişken tipi kullanmamız lazımmış. Bugün de yeni bir bilgi...*/

 /*Java'da compareTo metodu bir karşılaştırma yapar ve sonuç olarak -1, 0 veya 1 değerlerini döndürür:

-1: Bu BigInteger diğerinden küçüktür.
0: Bu BigInteger diğerine eşittir.
1: Bu BigInteger diğerinden büyüktür.

sayi.compareTo(BigInteger.TEN) > 0   --->Bu ifade, sayi değişkeninin 10'dan büyük olup olmadığını kontrol eder:
sayi.compareTo(BigInteger.TEN) ifadesi 1 dönerse, sayi 10'dan büyüktür.
sayi.compareTo(BigInteger.TEN) ifadesi 0 dönerse, sayi 10'a eşittir.
sayi.compareTo(BigInteger.TEN) ifadesi -1 dönerse, sayi 10'dan küçüktür.

BigInteger.divideAndRemainder(BigInteger val) metodu, bir BigInteger sayısını başka bir BigInteger sayısına böler ve
sonucu hem bölüm hem de kalan olarak döndürür.
Bu metod, iki değer döndürdüğü için bir dizi (BigInteger[]) kullanılır. Metot, şu iki öğeyi içeren bir dizi döndürür:

Bölüm (sonuc[0]): Sayının val ile bölümünden elde edilen tam sayı kısmı.
Kalan (sonuc[1]): Sayının val ile bölümünden kalan kısım, yani mod işleminin sonucu.
Bu metodu dizi olarak kullanmamızın nedeni, aynı anda hem bölümü hem de kalanı elde etmek istememizdir.
Örneğin, sayi.divideAndRemainder(BigInteger.TEN) işlemi, sayıyı 10'a böler ve sonucu iki parça halinde döndürür:

sonuc[0]: Bölme işleminin tam sayı kısmı.
sonuc[1]: Mod alma işleminin sonucu, yani kalan.

Örneğin, eğer sayi değeri 1234 ise:
BigInteger[] sonuc = sayi.divideAndRemainder(BigInteger.TEN);
Bu durumda:
sonuc[0] = 123 (1234'ü 10'a böldüğünüzde elde edilen tam sayı kısmı)
sonuc[1] = 4 (1234'ün 10'a bölümünden kalan, yani mod işlemi sonucu)
Bu iki değeri dizi şeklinde kullanmamız, bir satırda hem bölüm hem de kalanı elde etmemize olanak tanır.*/
    }
}