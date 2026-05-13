package application;

import java.util.Scanner;
import model.entities.Account;
import model.exception.InsufficientFundsException;
import model.exception.WithdrawLimitException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Limpar

        System.out.print("Holder: ");
        String holder = scanner.nextLine();

        System.out.print("Initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double withdraw = scanner.nextDouble();

        Account acc = new Account(accountNumber, holder, initialBalance, withdrawLimit);

        try {
            acc.withdraw(withdraw);
            
            System.out.printf("New balance: %.2f%n", acc.getBalance());
        } catch (WithdrawLimitException | InsufficientFundsException e) {
            System.out.printf("Withdraw exception: %s%n", e.getMessage());
        }

        scanner.close();
    }
}
