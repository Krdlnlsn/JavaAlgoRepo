package largestprimefactor;

public class LargestPrimeFactor {

    public static void main(String[] args) {
     /*The prime factors of 13195 are 5,7,13 and 29.
     What is the largest prime factor of the number 600851475143?*/
     /*13195'in asal çarpanları 5,7,13 ve 29'dur.
     600851475143 sayısının en büyük asal çarpanı kaçtır?*/

        long sayi = 600851475143L;
        long enBuyukAsal = 0;

//İlk olarak, sayi'nın 2'ye bölünüp bölünmediği kontrol edilir.
//2 asal olduğu için ve aynı zamanda en küçük asal sayı olduğu için, bu kontrolü önce yaparız.
//Eğer sayi 2'ye tam bölünüyorsa, bu bölme işlemi gerçekleştirilir ve sayi 2'ye bölünür.
//Bu işlem sayi 2'ye bölünemeyene kadar devam eder.
//Bu adımın amacı, sayi'dan tüm 2 çarpanlarını çıkarıp geriye tek sayı bırakmaktır.
        while (sayi % 2 == 0) {
            enBuyukAsal = 2;
            sayi /= 2;
        }

//Bu döngü, sayi'nın kareköküne kadar olan tek sayıları kontrol eder.
//i 3'ten başlayarak sadece tek sayıları (asal olabilecek adayları) kontrol eder, çünkü 2'nin dışındaki çift sayılar asal olamaz.
//Eğer sayi bu i sayısına tam bölünüyorsa, bu i en büyük asal çarpan olabilir ve sayi bu i ile bölünür.
//Bu işlem, sayi bu i'ye bölünemeyene kadar devam eder.
//İçerideki while döngüsü, sayi bu i değerine tam olarak bölünebildiği sürece bölme işlemini yapar 
//ve enBuyukAsal'ı günceller.
        for (long i = 3; i <= Math.sqrt(sayi); i += 2) {
            while (sayi % i == 0) {
                enBuyukAsal = i;
                sayi /= i;
            }
        }

// Döngüden çıktıktan sonra geriye kalan sayi 2'den büyükse, bu kalan sayı zaten bir asal sayıdır ve en büyük asal çarpandır.
//Bu durum, sayi'nın kendisinin bir asal sayı olduğu veya döngüde geriye kalan kısmın asal bir sayı olduğu anlamına gelir.
//Bu bloğun neden yazıldığını anlamak için örnek olarak 29 sayısını düşün.
        if (sayi > 2) {
            enBuyukAsal = sayi;
        }

        System.out.println("En büyük asal çarpan: " + enBuyukAsal);

        //Küçük bilgilendirmeler
        /*Özet
    Kod, önce sayi'nın 2'ye bölünebileceği tüm durumları ele alır ve sayıyı 2'ye bölmeye devam eder.
    Ardından, kalan sayıyı 3'ten başlayarak tek sayılarla kontrol eder ve bu sayıları asal çarpan olarak belirler.
    En son, döngüden çıktıktan sonra geriye kalan sayı hala 2'den büyükse, bu sayı en büyük asal çarpan olarak kabul edilir.
    Bu yaklaşım, asal çarpanları bulma işlemini verimli bir şekilde gerçekleştirir.*/
        
     /*örnek olarak 29 sayısını ele alalım
    Bu döngüde i 3'ten başlar ve Math.sqrt(29)'a kadar gider.
    29'un karekökü yaklaşık 5.38 olduğu için i 3, 5 olur.
    29, ne 3'e ne de 5'e tam bölünebilir, bu yüzden while döngüsü hiç çalışmaz ve enBuyukAsal hiç güncellenmez.
    ***Eğer Kontrol Kodu Olmazsa (if (sayi > 2))
    enBuyukAsal değişkeni hiç güncellenmediği için, bu durumda enBuyukAsal değeri 0 olarak kalır.
    Bu, 29 gibi asal olan bir sayının en büyük asal çarpanını doğru bir şekilde bulamamamıza neden olur.
    Yani sonuç olarak, çıktıda En büyük asal çarpan: 0 gibi yanlış bir sonuç elde ederiz.*/
    }

}
