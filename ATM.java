
import java.util.Scanner;
public class ATM {
    private double balance;
    public ATM(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        } else {
            System.out.println("Insufficient funds. Your balance is: " + balance);
        }
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: " + balance);
    }
    public double checkBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM.");
        System.out.println("Please enter your account balance:");
        double balance = scanner.nextDouble();
        ATM atm = new ATM(balance);
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            do {
                if(option==1){ 
                // case 1:
                    System.out.println("Enter the amount you want to withdraw:");
                    double amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    // break;
            }else if(option==2){ 
                // case 2:
                    System.out.println("Enter the amount you want to deposit:");
                   double amount = scanner.nextDouble();
                    atm.deposit(amount);
                    // break;
            }else if(option==3){ 
                // case 3:
                    System.out.println("Your balance is: " + atm.checkBalance());
                    // break;
            }else if(option==4){ 
                // case 4:
                    System.out.println("Thank you for using the ATM.");
                    System.exit(0);
            }
        
                // default:
                    // System.out.println("Invalid option. Please choose a valid option.");
                    System.out.print("Do you want to continue? (1/2/3/4): ");
            option = scanner.nextInt();
        }
            
            while (option == 1 || option == 2|| option==3||option==4);
        
        System.out.println("Exiting the program.");

            scanner.close();
        }
        
       
    }
}

