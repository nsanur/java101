import java.util.Scanner;

public class tekSayiToplami {
   
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;


        do {
            System.out.print("Sayi giriniz: ");
            number = sc.nextInt();
            if  (number % 2 == 1) 
                sum += number;
            
        } while (number > 0);

        System.out.print("Toplam: " + sum);
        sc.close();
    }
}