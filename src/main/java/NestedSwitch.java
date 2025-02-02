import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner department=new Scanner(System.in);
        System.out.println("Enter your Department");
        System.out.println("1.IT ");
        System.out.println("2.HR ");
        System.out.println("3.Finance ");
        int sDepartment= department.next().charAt(0);
        switch (sDepartment){
            case '1':
                System.out.println("which job role you want to apply ");
                System.out.println("1.developer");
                System.out.println("2.Tester");
                int role=department.next().charAt(0);
                switch (role){
                    case '1':
                        System.out.println("you chose the role of developer");
                        break;
                    case '2':
                        System.out.println("you chose the role of Tester");
                        break;
                    default:
                        System.out.println("you chose wrong option");
                }
            break;
            case '2':
                System.out.println("which job role you want to apply ");
                System.out.println("1.payroll manager");
                System.out.println("2.Recruiter");
                int role1=department.next().charAt(0);
                switch (role1) {
                    case '1':
                        System.out.println("you chose the role of payroll manager");
                        break;
                    case '2':
                        System.out.println("you chose the role of recruiter");
                        break;
                    default:
                        System.out.println("you chose wrong option");
                }
            break;
            case '3':
                System.out.println("which job role you want to apply ");
                System.out.println("1.Accountant");
                System.out.println("2.Cashier");
                int role2=department.next().charAt(0);
                switch (role2) {
                    case '1':
                        System.out.println("you chose the role of Accountant");
                        break;
                    case '2':
                        System.out.println("you chose the role of Cashier");
                        break;
                    default:
                        System.out.println("you chose wrong option");
                }

            default:
                System.out.println("you chose wrong option");

        }
    }
}
