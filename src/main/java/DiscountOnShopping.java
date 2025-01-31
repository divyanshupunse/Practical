import java.util.Scanner;
import java.io.IOException;
public class DiscountOnShopping {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter your bill amount");
        int a= num.nextInt();
        float finalAmount;

        if(a<=1000){
            System.out.println("You Didn't get any discount your bill is = " + a);
        }
        else if(a<=5000){
            float discount=a*0.1f;
            finalAmount=a-discount;
            System.out.println("You get 10% discount your bill is = " + finalAmount);
        }
        else if(a<=10000){
            float discount=a*0.20f;
            finalAmount=a-discount;
            System.out.println("You get 20% discount your bill is = " + finalAmount);
        }
        else {
            float discount=a*0.30f;
            finalAmount=a-discount;
            System.out.println("You get 30% discount your bill is = " + finalAmount);
        }
 num.close();


    }
}
