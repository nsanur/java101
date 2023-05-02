import java.util.Scanner;
public class kdvTutari {
    public static void main(String[] args){

        double tutar, kdvOrani, kdvTutari, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Ucret tutarini giriniz: ");
        tutar = input.nextDouble();

        kdvOrani = tutar < 1000 ? 0.18 : 0.08;

        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDVsiz Tutar: " + tutar);
        System.out.println("KDV Orani: " + kdvOrani);
        System.out.println("KDV Tutari: " + kdvTutari);
        System.out.println("KDVli Tutar: " + kdvliTutar);

    }
}
