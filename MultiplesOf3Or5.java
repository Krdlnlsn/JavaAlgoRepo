package multiplesof3or5;
public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        /*If we list all the natural numbers below 10 that are multiples of 3 or 5,
        we get 3,5,6 and 9. The sum of these multiples is 23.
        Find the sum of all the multiples of 3 or 5 below 1000.*/
        /*Eğer 3 veya 5'in katı olan 10'un altındaki tüm doğal sayıları listelersek, 
        3,5,6 ve 9'u elde ederiz. Bu katların toplamı 23'tür. 
        1000'in altındaki 3 veya 5'in tüm katlarının toplamını bulun.*/
        
        int sum=0;
        int a=1;
        System.out.println("3 veya 5'in katı olan 1000'in altındaki tüm doğal sayılar: ");
        for (int i = 1; i < 1000; i++) {
            if (i%3==0 || i%5==0) {
                System.out.println(a+". sayı: "+i);
                sum+=i;
                a++;
            }
        }
        System.out.println("Katların toplamı: "+sum);  
    }
    
}
