import java.util.Scanner;
public class BankLoanEligibility {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your Annual income");
        int salary= num.nextInt();
        System.out.println("enter your Civil Score");
        int civil= num.nextInt();

        if(salary>=500000){
            if(civil>=700){
                System.out.println("loan is approved");
            }
            else{
                System.out.println("Your loan is rejected because your civil is low");
            }

        }
        else {
            System.out.println("Your income is below 5,00,000, loan is rejected");
        }
    }
}
