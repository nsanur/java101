import java.util.Scanner;

public class ciftSayiBulma {
   
    public static void main(String[] args) {
      int k ;
      Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        k = sc.nextInt();

        int i = 0;
        while (i <= k) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
            i++;
        }
        sc.close();
    }
}