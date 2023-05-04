import java.util.Scanner;

public class cinZodyak {
    public static void main(String args[]) {
        int birthYear;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dogum yilinizi giriniz: ");
        birthYear = sc.nextInt();

        int zodiacIndex = birthYear % 12;
        String zodiac;

        switch(zodiacIndex){
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Kopek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Okuz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavsan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yilan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                zodiac = "Gecersiz";
                break;
        }
        System.out.println("Cin Zodyagi Burcunuz: " + zodiac);

        sc.close();
    } 
}
