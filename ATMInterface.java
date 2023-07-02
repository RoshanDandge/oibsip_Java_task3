import java.util.Scanner;

public class ATMInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 1000; // Initial account balance

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        int choice;
        do {
            System.out.println(" ******** Welcome to ATM ********");
            System.out.println(" 1. Check Balance");
            System.out.println(" 2. Deposit Money");
            System.out.println(" 3. Withdraw Money");
            System.out.println(" 4. Exit");
            System.out.print(" Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    System.out.println("\n Thank you for using our ATM. Goodbye! \n");
                    System.out.println("*****************************************************");
                    break;
                default:
                    System.out.println("\n Invalid choice. Please try again.\n\n");
            }
        } while (choice != 4);
    }

    public static void checkBalance() {
        System.out.println("\n Your balance is= " + balance + "rs \n \n");
    }

    public static void depositMoney() {
        System.out.print("\n Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("\n Deposited rs-" + amount + " successfully.\n\n");
        } else {
            System.out.println("\n Invalid amount. Deposit failed.\n");
        }
    }

    public static void withdrawMoney() {
        System.out.print("\n Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(" \n Withdrawn rs-" + amount + " successfully.\n\n");
        } else {
            System.out.println("\n Invalid amount or insufficient balance. Withdrawal failed.\n\n");
        }
    }
}
