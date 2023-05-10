import java.util.Scanner;
public class IkininKuvvetleri {
    public static void main(String[] args) {

      int number ;

      Scanner sc = new Scanner(System.in);
        System.out.print("Sinir sayisini giriniz: ");
        number = sc.nextInt();

        for(int i = 1; i<= number; i*=2)
            System.out.println(i);

        sc.close();
    }
}
