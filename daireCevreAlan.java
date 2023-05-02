import java.util.Scanner;
public class daireCevreAlan {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Dairenin yaricapini giriniz: ");
        r = sc.nextInt();

        double cevre = 2*pi*r;
        double alan = pi*r*r;

        System.out.println("\nDairenin Cevresi " + cevre);
        System.out.println("Dairenin Alani: " + alan);

    }
}
