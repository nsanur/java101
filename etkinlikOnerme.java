import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args) {

        int heat;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Sicaklik giriniz: ");
        heat = sc.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsininiz.");
        }else if ( heat <= 25){
        if (heat <= 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat >= 10) {
            System.out.println("Piknige gidebilirsiniz.");
        }
        }else{
            System.out.println("Yuzmeye gidebilirsiniz.");
        }

        sc.close();

    }
}
