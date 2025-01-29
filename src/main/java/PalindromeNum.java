import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println("enter your num");
        int num =v.nextInt();
        int reversed=0,original=num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
