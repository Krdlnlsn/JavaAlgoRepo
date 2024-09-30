package summationofprimes;

public class SummationOfPrimes {

    public static void main(String[] args) {
        /*The sum of the primes below 10 is 2+3+5+7=17.
        Find the sum of all the primes below two million.*/
        /*10'un altındaki asal sayıların toplamı 2+3+5+7=17'dir.
        İki milyonun altındaki tüm asal sayıların toplamını bulunuz.*/

        //Eratosthenes'in Eleği algoritması
        long toplam = 0;
        int limit = 2000000;
        boolean[] asalMi = new boolean[limit + 1];

        // Tüm sayıları asal olarak işaretliyoruz
        for (int i = 2; i <= limit; i++) {
            asalMi[i] = true;
        }

        // Eratosthenes'in Eleğini uygulama
        for (int i = 2; i * i <= limit; i++) {
            if (asalMi[i]) {
              for (int j = i * i; j <= limit; j += i) {
                    asalMi[j] = false;
                }
            }
        }
        // Tüm asal sayıları toplayalımm
        for (int i = 2; i <= limit; i++) {
            if (asalMi[i]) {
               // System.out.println(i + " - Asaldır.");
                toplam += i;
            }
        }
        System.out.println("Toplam: " + toplam);
    }
}

   //YapayZekaSağOlsunYardımcıOluyor...
   /* 2.Blok:
   i*i <= limit koşulu, gereksiz kontrolleri azaltmak için kullanılır. Bu, algoritmanın daha hızlı çalışmasını sağlar.
   Amaç: asalMi[i] değeri true ise, i sayısı hala asal kabul edilir, 
   bu yüzden i'nin katlarını asal olmayanlar olarak işaretlemek için iç döngüye girilir.
   Koşul: Eğer asalMi[i] false ise, bu sayı önceden asal olmayan olarak işaretlenmiştir ve bu yüzden atlanır.
   2.Blok İç Döngü:
   Bu iç döngü, dış döngüde bulunan bir asal sayının (örneğin i sayısının) tüm katlarını asal olmayan olarak işaretlemek için kullanılır.
   Bu katlar, i sayısının kendisinin çarpanlarıdır ve asal olmadığı için asalMi[j] = false ile işaretlenir.
   Döngü, j = i * i ile başlar. Bu önemli bir optimizasyondur ve şu nedenden kaynaklanır:
   Daha küçük katlar (i * 2, i * 3, vs.) zaten dış döngünün önceki adımlarında elenmiş olur.
   Örnek 1: i = 2
   i = 2 olduğunda, 2'nin katlarını asal olmayan olarak işaretlemeye başlarız.
   Eğer j = 2 * 2 = 4'ten başlarsak, 4, 6, 8, 10, ... şeklinde 2'nin tüm katlarını asalMi[j] = false ile asal olmayan olarak işaretleriz.
   Dikkat edin: j = i * 2 = 4, 6, ve diğer sayılar önceki dış döngü adımlarında zaten işaretlenmiş olacağı için,
   i = 2'de j = 2 * 2'den başlamak verimsizliği ortadan kaldırır.
   Örnek 2: i = 3
   i = 3 olduğunda, döngü j = 3 * 3 = 9'dan başlar. Daha önceki döngüde i = 2 iken 3'ün küçük katları (örneğin 3 * 2 = 6) zaten elenmiştir.
   Yani 3 * 3 = 9'dan başlamak yeterlidir.Bu noktadan sonra, 9, 12, 15, 18... gibi 3'ün katlarını asal olmayan olarak işaretleriz.
   3. Artış: j += i
   Döngü her adımda i kadar artırılır, yani bir sonraki katına geçilir. Örneğin:
   i = 2 için: j = 2 * 2 = 4, sonraki adımda j = 4 + 2 = 6, sonraki adımda j = 6 + 2 = 8... şeklinde devam eder.
   i = 3 için: j = 3 * 3 = 9, sonraki adımda j = 9 + 3 = 12, sonraki adımda j = 12 + 3 = 15... şeklinde ilerler.
   Bu şekilde, i'nin her bir katı sırasıyla kontrol edilip asal olmayan olarak işaretlenir.
                    
   Neden limit + 1 Kullanıyoruz?
   Java'da diziler 0 indeksli olduğu için, örneğin int[] dizi = new int[10]; dediğimizde,
   bu dizi 0'dan 9'a kadar olan indekslere sahip olur. Yani dizinin boyutu 10 olmasına rağmen, son indeks 9 olacaktır.
   Aynı mantıkla, limit = 2000000 olduğunda, 0'dan 2.000.000'a kadar tüm sayıları kontrol edebilmek için
   dizi boyutunu 2000001 olarak belirlememiz gerekir. Aksi halde, eğer sadece limit boyutunda (yani 2000000 elemanlı) bir dizi oluşturursak,
   2 milyonuncu sayıyı (indeks olarak asalMi[2000000]) kontrol edemeyiz.*/

   /*Neden i * i'den Başlanıyor?
   Daha küçük çarpanlar (örneğin, i * 2, i * 3) dış döngüde daha önceki adımlarda zaten elenmiş olduğu için,
   gereksiz yere bu sayıları tekrar kontrol etmek performansı düşürürdü. i * i'den başlayarak bu gereksiz kontrollerden kaçınıyoruz.*/