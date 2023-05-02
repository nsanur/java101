import java.util.Scanner;
public class vucutKitleInd {
    public static void main(String[] args) {

        double boy, kilo, indeks;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = sc.nextDouble();

        System.out.print("Lütfen kilonuzu (kg) giriniz: ");
        kilo = sc.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("\nVucut Kitle Indeksiniz: " + indeks);

    }
}
