import java.util.Scanner;
public class ucgeninAlani {
    public static void main(String[] args){

        int a, b;
        double c, u, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("a kenarini giriniz: ");
        a = input.nextInt();

        System.out.print("b kenarini giriniz: ");
        b = input.nextInt();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenus: " + c);

        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Ucgenin Cevresi: " + cevre);
        System.out.println("Ucgenin Alani: " + alan);

    }

}
