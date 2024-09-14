package asalkontrol;

import java.util.Scanner;

public class AsalKontrol {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int sayi = scan.nextInt();

        //Bu kısımda return kullanmamızın sebebi, kodun bu noktada sonlandırılmasını sağlamak.
        //Bu, gereksiz işlemlerin yapılmasını önler.
        //Böylece, asal sayı kontrolü yapan sonraki kısımlar çalıştırılmıyor.
        if (sayi <= 1) {
            System.out.println(sayi + " asal değildir.");
            return;
        }
        //return ifadesi burada da programın bu noktada sonlanmasını sağlar ve 
        //geri kalan asal kontrol işlemlerini atlar.
        //Bu sayede, gereksiz döngülerden kaçınmış oluyoruz.
        if (sayi == 2) {
            System.out.println("2 sayısı asaldır.");
            return;
        }

        //Eğer sayi herhangi bir i değerine tam bölünürse (sayi % i == 0),
        // bu durumda sayi asal değildir ve asal değişkeni false olur.
        //Döngüyü sonlandırmak için break kullanılır.
        boolean asal = true;
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                asal = false;
                break;
            }
        }

        if (asal) {
            System.out.println(sayi + " asal sayıdır.");
        } else {
            System.out.println(sayi + " asal değildir.");
        }

        /*@Küçük bilgilendirmeler
                                         Neden return Kullanıyoruz?
Verimlilik: Sayı 1'den küçük veya 2 ise, daha fazla kontrol yapmaya gerek yoktur.
        return kullanarak, programın gereksiz döngü ve kontrollerden kaçınmasını sağlıyoruz.
Kodun Anlaşılabilirliği: return ile program akışını net bir şekilde kontrol ederek,
        hangi durumlarda kontrolün sona erdirileceğini belirtmiş oluyoruz. Bu da kodun daha anlaşılır olmasını sağlar.
 
             Math.sqrt(sayi) ifadesini kullanmamızın nedeni,
        bir sayının asal olup olmadığını kontrol ederken sayıyı tam bölebilecek en büyük sayının o sayının karekökü olmasından kaynaklanır.
        Bu, asal sayı kontrolünü daha verimli hale getirir. İşte bu yaklaşımın arkasındaki mantık:

                                         Neden Math.sqrt(sayi)?
Asal Sayıların Tanımı: Bir sayının asal olması için, yalnızca 1 ve kendisi dışında hiçbir sayıya tam bölünmemesi gerekir.
Bölenlerin Özelliği: Eğer bir sayı n asal değilse, bu sayı iki çarpanın çarpımı olarak ifade edilebilir,
        yani n = a * b. Bu durumda, a ve b çarpanlarından en az biri sqrt(n)'den küçük* veya eşit* olacaktır.
        Eğer her iki çarpan da sqrt(n)'den büyük olsaydı, çarpımları n'den büyük olurdu, bu da imkansızdır.
Örnek: Diyelim ki n = 36. Kare kökü sqrt(36) = 6'dır. Bölen çiftleri şunlardır: (1, 36), (2, 18), (3, 12), (4, 9), (6, 6).
        Gördüğünüz gibi, 6 ve daha küçük sayılar kontrol edilerek 36'nın asal olmadığı tespit edilebilir.
Verimlilik: Sayının kareköküne kadar olan bölenleri kontrol ederek, gereksiz kontrollerden kaçınırız.
        Normalde n kadar kontrol yapmak yerine, sqrt(n) kadar kontrol yaparız. +
        Bu da özellikle büyük sayılar için işlem süresini önemli ölçüde azaltır.*/
        //Asal sayılardan nefret ediyorum:P
    }
}
