import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;
        int sum = 0, count = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = sc.nextInt();

        if(mat >= 0 && mat <= 100){
            sum += mat;
            count++;
        }
            
        System.out.print("Fizik notunuz: ");
        fizik = sc.nextInt();

        if(fizik >= 0 && fizik <= 100){
            sum += fizik;
            count++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = sc.nextInt();

        if(kimya >= 0 && kimya <= 100){
            sum += kimya;
            count++;
        }
        System.out.print("Turkce notunuz: ");
        turkce = sc.nextInt();

        if(turkce >= 0 && turkce <= 100){
            sum += turkce;
            count++;
        }

        System.out.print("Muzik notunuz: ");
        muzik = sc.nextInt();

        if(muzik >= 0 && muzik <= 100){
            sum += muzik;
            count++;
        }

        double average = sum / count;

        if(average <= 55)
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere!");
        else
            System.out.println("Tebrikler, sinifi gectiniz!");
        
        System.out.println("Ortalamaniz: " + average);

        sc.close();

    }
}
