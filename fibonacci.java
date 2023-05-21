import java.util.Scanner; 
public class fibonacci {
    public static void main(String[] args) {

        int number, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Eleman sayisini giriniz: ");
        number = sc.nextInt();

        int n1=0;
        int n2=1;
        System.out.print(n1 + " "+ n2);
        for(int i = 0; i <= number-2; i++){
            sum = n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(" " + sum);
        }

        sc.close();

    }
}
