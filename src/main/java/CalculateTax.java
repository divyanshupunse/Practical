import java.util.Scanner;
public class CalculateTax {
    public static void main(String[]a){
        System.out.println("Enter your Income");
        Scanner value=new Scanner(System.in);
        int inc= value.nextInt();
        if (inc<=250000){
            System.out.println("you paid 0% tax");
        } else if (inc<=500000) {
            System.out.println("You paid 5% tax");
        } else if (inc<=750000) {
            System.out.println("You paid 10% tax");
        }
        else {
            System.out.println("You pais 30% tax");
        }
    }
}
