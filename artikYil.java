import java.util.Scanner;

public class artikYil {
    public static void main(String args[]) {

        int year;

        Scanner sc = new Scanner(System.in);

        System.out.print("Yil Giriniz: ");
        year = sc.nextInt();

        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.print(year + " bir artik yildir !");
        }else {
            System.out.println(year + " bir artik yil degildir !");
        }

        sc.close();
    } 
}
