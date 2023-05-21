import java.util.Scanner; 
public class mukemmelSayi { 
    public static void main(String[] args) { 

        int number, i, counter = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        number = sc.nextInt();

        for(i=1; i<number; i++)
            if(number%i == 0)
                counter+=i;
        

        if(counter == number)
            System.out.print(number + " mukemmel sayidir.");
        else
            System.out.print(number +" mukemmel sayi degildir. ");
        
        sc.close();

    }
}