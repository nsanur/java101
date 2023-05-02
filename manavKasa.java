import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        int a, e, d, m, p;
        Scanner sc = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        a = sc.nextInt();
        armut = a*armut;

        System.out.print("Elma Kaç Kilo ? :");
        e = sc.nextInt();
        elma = e*elma;

        System.out.print("Domates Kaç Kilo ? :");
        d = sc.nextInt();
        domates = d*domates;

        System.out.print("Muz Kaç Kilo ? :");
        m = sc.nextInt();
        muz = m*muz;

        System.out.print("Patlican Kaç Kilo ? :");
        p = sc.nextInt();
        patlican = p*patlican;

        double total = armut + elma + domates + muz + patlican;

        System.out.println("\nToplam Tutar : " + total + " TL");

    }
}
