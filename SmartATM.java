import java.util.Scanner;

public class SmartATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int enterPin;
        int balance = 5000;
        int choice, amount;

        System.out.println("****SMART ATM****");
        System.out.print(" Now Enter PIN: ");
        enterPin = sc.nextInt();

        if (enterPin == pin) {

            System.out.println("PIN Verified!");

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance = ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ₹");
                    amount = sc.nextInt();
                    balance = balance + amount;
                    System.out.println("New Balance = ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ₹");
                    amount = sc.nextInt();

                    if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Remaining Balance = ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Smart ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } else {
            System.out.println("Wrong PIN");
        }

        sc.close();
    }
}
    



        

    

  