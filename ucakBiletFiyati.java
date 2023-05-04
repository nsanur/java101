import java.util.Scanner;

public class ucakBiletFiyati {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age,distance,direction;
        double amount,ageDiscount,roundDiscount,discountedAmount,total=0;

        System.out.print("Mesafeyi km turuden giriniz : ");
        distance=sc.nextInt();
        System.out.print("Yasinizi giriniz : ");
        age=sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
        direction=sc.nextInt();

        if(distance>0 && age>0 && direction==1 || direction==2){

            amount=distance*0.10;
            if(age<12){
                ageDiscount=amount*0.5;
                discountedAmount=amount-ageDiscount;
                total=discountedAmount;
                if(direction==2){
                    roundDiscount=discountedAmount*0.2;
                    total=(discountedAmount-roundDiscount)*2;

                }
            }
            else if(age>=12 && age<25){
                ageDiscount=amount*0.1;
                discountedAmount=amount-ageDiscount;
                total=discountedAmount;
                if(direction==2){
                    roundDiscount=discountedAmount*0.2;
                    total=(discountedAmount-roundDiscount)*2;

                }
            }
            else if(age>65){
                ageDiscount=amount*0.3;
                discountedAmount=amount-ageDiscount;
                total=discountedAmount;
                if(direction==2){
                    roundDiscount=discountedAmount*0.2;
                    total=(discountedAmount-roundDiscount)*2;

                }
            }
            else{
                total = amount;
            }
            System.out.println("\nToplam Tutar = " + total + " TL");
        }else {
            System.out.println("\nHatali Veri Girdiniz!");
        }
        

        sc.close();

    }
}


