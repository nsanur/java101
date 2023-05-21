
import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int adet,sayi;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Kac adet sayi gireceksiniz:");
        adet = input.nextInt();

        for(int a=1;a<=adet;a++){

            System.out.print(a + ". sayiyi giriniz:");
            sayi = input.nextInt();

            if(sayi>max) max = sayi;
            if(sayi<min) min = sayi;
        }

        System.out.println("en büyük değer: " + max);
        System.out.println("en küçük değer: " + min);

        input.close();
    }
}
