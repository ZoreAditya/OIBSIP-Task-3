import java.util.*;
public class Atm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Register Yourself");
        System.out.print("Enter Your Choice - ");
        System.out.println("Yes or No");
        String choice = sc.next();
        choice = choice.toLowerCase();
        if (choice.equals("yes")) {
            BankAccount bank = new BankAccount();
            bank.register();

            while(true) {
                boolean login_status;
                do {
                    while(true) {
                        System.out.println("Login to BankAccount");
                       System.out.println("Press 1 to login");
                        System.out.print("Enter Your Choice - ");
                        int user_choice = sc.nextInt();
                        if (user_choice==1) {
                            login_status = bank.login();
                            break;
                        }

                    }
                } while(!login_status);

                System.out.println("\n\n----------- WELCOME " + bank.name + " !! -----------\n");
                boolean is_quit = false;

                while(!is_quit) {
                    System.out.println("1.Deposit Money");
                    System.out.println("2.Withdraw Money");
                    System.out.println("3.Transfer Money");
                    System.out.println("4.Check Bank Balance");
                    System.out.println("5.Quit");
                    System.out.println("____________________________");
                    System.out.print("Enter Your Choice - ");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            bank.deposit_money();
                            break;
                        case 2:
                            bank.withdraw_money();
                            break;
                        case 3:
                            bank.transfer_money();
                            break;
                        case 4:
                            bank.check_Balance();
                            break;
                        case 5:
                            is_quit = true;
                            System.out.println("--------------------Thanks for visiting " + bank.name + "!-----------------");                            System.exit(0);
                    }
                }
            }
        }
}}
