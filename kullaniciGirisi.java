import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {

        String username, password, select;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanici adiniz: ");
        username = sc.nextLine();

        System.out.print("Sifreniz: ");
        password = sc.nextLine();

        if(username.equals("patika") && password.equals("java101"))
            System.out.println("Giris Yaptiniz!");
        else {
            System.out.print("Bilgileriniz Yanlis!\nSifrenizi sifirlamak ister misiniz? (y/n): ");
            select = sc.nextLine();

            if(select.equals("y")){

                System.out.print("Yeni sifrenizi giriniz: ");
                select = sc.nextLine();

                if(select.equals("java101"))
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                else
                System.out.println("Sifre olusturuldu.");
            }
        }

        sc.close();

    }
}
