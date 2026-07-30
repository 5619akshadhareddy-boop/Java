import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        int at = email.indexOf('@');
        int dot = email.lastIndexOf('.');

        if (at > 0 &&
            dot > at + 1 &&
            dot < email.length() - 1 &&
            at < dot) {

            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}
