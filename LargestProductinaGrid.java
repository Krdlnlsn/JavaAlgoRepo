package largestproductinagrid;

public class LargestProductinaGrid {

    public static void main(String[] args) {
        /*In the 20 X 20 grid below, four numbers along a diagonal line have been marked in red.
            08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
            49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
            81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
            52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
            22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
            24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
            32 98 81 28 64 23 67 10 *26 38 40 67 59 54 70 66 18 38 64 70
            67 26 20 68 02 62 12 20 95 *63 94 39 63 08 40 91 66 49 94 21
            24 55 58 05 66 73 99 26 97 17 *78 78 96 83 14 88 34 89 63 72
            21 36 23 09 75 00 76 44 20 45 35 * 14 00 61 33 97 34 31 33 95
            78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
            16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
            86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
            19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
            04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
            88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
            04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
            20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
            20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
            01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48
        The product of these numbers is 26*63*78*14= 1788696.
        What is the greatest product of four adjacent numbers in the same direction 
        (up, down, left, right, or diagonally) in the 20*20 grid?*/
 /*Aşağıdaki 20 X 20'lik tabloda, çapraz bir çizgi boyunca dört sayı kırmızı ile işaretlenmiştir.
        Bu sayıların çarpımı 26*63*78*14= 1788696'dır. 20*20'lik tabloda aynı yönde 
        (yukarı, aşağı, sola, sağa veya çapraz) dört bitişik sayının en büyük çarpımı nedir?*/

        String tablo
                = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 "
                + "49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 "
                + "81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 "
                + "52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 "
                + "22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 "
                + "24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 "
                + "32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 "
                + "67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 "
                + "24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 "
                + "21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 "
                + "78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 "
                + "16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 "
                + "86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 "
                + "19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 "
                + "04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 "
                + "88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 "
                + "04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 "
                + "20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 "
                + "20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 "
                + "01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";

        // Tabloyu iki basamaklı sayılara dönüştürelim
        String[] tabloDizisi = tablo.split(" "); 
        int[][] tabloSayilar = new int[20][20];
        /*Bu aşamadan sonra, tabloDizisi string türünde sayıları içerirken, tabloSayilar int türünde sayıları içerecek şekilde
        doldurulmaya hazır hale gelir. Yani, ilerideki kod parçasında her string sayı tabloDizisinden alınıp
        tam sayıya çevrilerek tabloSayilar dizisine aktarılacak.*/

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                tabloSayilar[i][j] = Integer.parseInt(tabloDizisi[i * 20 + j]); //her bir string değerini alıp int yapıyoruz
            }
        }

        // En büyük çarpımı bulmak için
        int enBuyukCarpim = 0;

        // 1. Yatay (sağa doğru) çarpımları kontrol edelim
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) { //sütun 16,17,18,19 olması lazım so 17 dedik
                int carpim = tabloSayilar[i][j] * tabloSayilar[i][j + 1] * tabloSayilar[i][j + 2] * tabloSayilar[i][j + 3];
                if (carpim > enBuyukCarpim) {
                    enBuyukCarpim = carpim;
                }
            }
        }

        // 2. Dikey (aşağı doğru) çarpımları
        for (int i = 0; i < 17; i++) { //satır kısmı 16,17,18,19
            for (int j = 0; j < 20; j++) {
                int carpim = tabloSayilar[i][j] * tabloSayilar[i + 1][j] * tabloSayilar[i + 2][j] * tabloSayilar[i + 3][j];
                if (carpim > enBuyukCarpim) {
                    enBuyukCarpim = carpim;
                }
            }
        }

        // 3. Çapraz (sağ aşağı) çarpımları
        for (int i = 0; i < 17; i++) { //Amaç: 17 satır boyunca döngü yapmak. 16,17,18,19
            for (int j = 0; j < 17; j++) { //Amaç: 17 sütun boyunca döngü yapmak.
                int carpim = tabloSayilar[i][j] * tabloSayilar[i + 1][j + 1] * tabloSayilar[i + 2][j + 2] * tabloSayilar[i + 3][j + 3];
                if (carpim > enBuyukCarpim) {
                    enBuyukCarpim = carpim;
                }
            }
        }

        // 4. Çapraz (sol aşağı) çarpımları. aslında bir satırdan başlayarak sütunlaru bitirene kadar sol aşağı 4lüyü alıyor. 
        //sonra tekrardan alt satıra geçip sütunlar bitene kadar sol alt 4lüyü alıyor...
        for (int i = 0; i < 17; i++) { //Amaç: 17 satır boyunca döngü yapmak.
            for (int j = 3; j < 20; j++) {
                int carpim = tabloSayilar[i][j] * tabloSayilar[i + 1][j - 1] * tabloSayilar[i + 2][j - 2] * tabloSayilar[i + 3][j - 3];
                if (carpim > enBuyukCarpim) {
                    enBuyukCarpim = carpim;
                }
            }
        }

        System.out.println("En büyük çarpım: " + enBuyukCarpim);

        /*String[] tabloDizisi = tablo.split(" "); satirinin aciklamasi:
        split(" ") fonksiyonu, boşluk karakterine göre tabloyu parçalara ayırır. 
        Böylece her sayı ayrı bir String elemanı haline gelir ve tabloDizisi adlı bir diziye atanır.
        Örneğin, "08 02 22 97 ...", "08", "02", "22", "97" gibi parçalanır ve bir diziye yerleştirilir.
       tabloSayilar[i][j] = Integer.parseInt(tabloDizisi[i * 20 + j]); açıklama:
        tabloDizisi[i * 20 + j] ifadesi, tabloDizisi'nden her bir sayıyı alır.
        i * 20 ifadesi, satırların başlangıç indeksini temsil eder.
        j ise sütun indeksini temsil eder.
        Örneğin, i = 0 ve j = 0 iken tabloDizisi[0] alınır, i = 1 ve j = 0 olduğunda ise tabloDizisi[20] alınır 
        (bu da bir sonraki satırın başındaki sayıyı ifade eder).
        Integer.parseInt(tabloDizisi[i * 20 + j]) ifadesi, tabloDizisindeki string sayıyı tam sayıya çevirir.
       3. Çapraz (sağ aşağı) çarpım açıklama:
        Çaprazda, hem satır hem de sütun sayısı aynı anda artar, bu nedenle sayılar sağ aşağıya doğru çapraz bir çizgi oluşturur.
        i değişkeni satır sayısını temsil eder. Döngü, satır bazında 0'dan 16'ya kadar çalışır (toplam 17 satır).
        Bu sınır, i + 3 ifadesinin tablo dışına çıkmasını önlemek için 17 olarak belirlenmiştir,
        çünkü dört sayı alındığında 17. satır son olacak ve i + 3 en fazla 19'a kadar ulaşabilir (tablonun son satırı).
        j değişkeni sütun sayısını temsil eder. Döngü, sütun bazında 0'dan 16'ya kadar çalışır.
        Yine, dört sayı seçildiğinde tablo dışına çıkmamak için bu sınır belirlenmiştir. j + 3, en fazla 19'a ulaşabilir (tablonun son sütunu).
       4. Çapraz (sol aşağı) çarpım aciklama: 
        i değişkeni satır sayısını temsil eder. Döngü 0'dan 16'ya kadar döner (toplam 17 satır).
        Bu sınır, dört sayı çapraz alındığında tablo dışına çıkılmasını engeller.
        Çünkü dört sayı alındığında i + 3 ifadesi en fazla 19'a (son satır) kadar ulaşabilir.
       for (int j = 3; j < 20; j++) acik.: 
        j değişkeni sütun sayısını temsil eder. Döngü, 3. sütundan başlayarak 19. sütuna kadar döner.
        Döngünün 3'ten başlatılmasının nedeni, dört sayı sol çapraz alındığında sütun değeri j - 3 ile 0'ın altına düşmemesi içindir.
        Yani 0. sütuna geliyoruz öyle anla. Böylece tablo sınırlarının dışına çıkılmaz. */
    }
}
