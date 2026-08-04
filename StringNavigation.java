import java.util.Scanner;
public class StringNavigation{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuffer navigation = new StringBuffer();
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1.Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Mini statement");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: 50,000");
                    navigation.append("Balance -> ");
                    break;

                case 2:
                    System.out.println("Deposit Selected");
                    navigation.append("Deposit -> ");
                    break;

                case 3:
                    System.out.println("Withdraw Selected");
                    navigation.append("Withdraw -> ");
                    break;

                case 4:
                    System.out.println("Mini Statement Displayed");
                    navigation.append("Mini Statement -> ");
                    break;

                case 5:
                    System.out.println("\nNavigation History:");
                    if (navigation.length() == 0) {
                        System.out.println("No navigation.");
                    } else {
                        System.out.println(navigation);
                    }
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
          }
          
        }while(choice!=5);
        sc.close();

    }  
}