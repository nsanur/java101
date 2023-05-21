import java.util.Scanner;
public class usluSayilar {
    public static void main(String[] args) {

      int number ,npow , total = 1;

      Scanner sc = new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        number = sc.nextInt();

        System.out.print("Sayinin ussunu giriniz: ");
        npow = sc.nextInt();

        for(int i = 1; i<= npow; i++)
            total = number*total;
        
        System.out.println(number + "^" + npow + " = " + total);

        sc.close();
    }
}
