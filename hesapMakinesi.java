import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {

        int num1, num2, select;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        num1 = sc.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        num2 = sc.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Bolme\n4-Bolme");
        System.out.print("Seciminiz: ");
        select = sc.nextInt();

        switch(select){

            case 1: System.out.println("Toplama: " + (num1+num2));
                break;
            case 2: System.out.println("Cikarma: " + (num1-num2));
                break;
            case 3: System.out.println("Carpma: " + (num1*num2));
                break;
            case 4: 
                if(num2 != 0)
                    System.out.println("Bolme: " + (num1/num2));
                else 
                    System.out.println("Bu sayi sifira bolunemez!");
                break;
            default:
                System.out.println("Yanlis secim yaptiniz.");
        }

        sc.close();

    }
}
