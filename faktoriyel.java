import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {

      int number ,total = 1;

      Scanner sc = new Scanner(System.in);
        System.out.print("Sinir sayisini giriniz: ");
        number = sc.nextInt();

        for(int i = 1; i<= number; i++)
            total = i*total;
        
        System.out.println(number + "! = " + total);

        sc.close();
    }
}
