import java.util.*;


public class BankAccount {

    String name;
    String user_Name;
    String password;
    String Account_No;
    int transactionAmount = 0;
    String transactionHistory = "";
    float balance = 50000.0F;
    Scanner sc;

    BankAccount() {
        this.sc = new Scanner(System.in);
    }

    public void register() {
        System.out.print("Enter Your Name : ");
        this.name = this.sc.nextLine();
        System.out.print("Enter Your Username : ");
        this.user_Name = this.sc.nextLine();
        System.out.print("Enter Your Password : ");
        this.password = this.sc.nextLine();
        System.out.println("Registered Successfully !");
        System.out.println("Proceed to Login");
        System.out.println("-------------------------------------------------------");
    }

    public boolean login() {
        boolean isLogin = false;

        while(!isLogin) {
            System.out.println("Enter Your Username : ");
            String user_name = this.sc.nextLine();
            System.out.print("Enter Your Password : ");
            String Password = this.sc.nextLine();
            if (user_name.equals(this.user_Name) & Password.equals(this.password)) {
                System.out.print("\nLogin Successful  !!\n");
                System.out.println("-------------------------------------------------------");
                isLogin = true;
            } else {
                System.out.println("\n Username or Password not found");
            }
        }

        return isLogin;
    }

    public void withdraw_money() {
        System.out.print("\nEnter amount to be withdraw : ");
        Scanner sc = new Scanner(System.in);
        float withdrawAmount = sc.nextFloat();
        if (this.balance >= withdrawAmount) {
            this.balance -= withdrawAmount;
            System.out.println("$" + withdrawAmount + " Withdrawn Successfully");
            System.out.println("-------------------------------------------------------");
            ++this.transactionAmount;
        } else {
            System.out.print("Sorry,cannot withdraw money due to Insufficient Balance! \n");
        }

    }

    public void deposit_money() {
        System.out.print("Enter money to be deposited:");
        float deposited_money = (float)this.sc.nextInt();
        this.balance += deposited_money;
        System.out.println("Amount of $." + deposited_money + " has been successfully depsited");
        System.out.println("-------------------------------------------------------");
    }

    public void transfer_money() {
        System.out.print("Enter transfer amount : ");
        float transfer_amount = this.sc.nextFloat();
        if (this.balance >= transfer_amount) {
            this.balance -= transfer_amount;
            System.out.println("$." + transfer_amount + " Transaction Successfully.");
            System.out.println("\n-------------------------------------------------------");
            ++this.transactionAmount;
        } else {
            System.out.println("\nSorry, you have Insufficient Balance !");
        }

    }

    public void check_Balance() {
        System.out.println("\nYour bank balance is : $" + this.balance);
        System.out.println("-------------------------------------------------------");
    }
}
