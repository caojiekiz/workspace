package beginner.chapter3.section1;

public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    public void checkBalance() {
        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }
    public double deposit(int amountToDeposit) {
        balance += amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
        return amountToDeposit;
    }
    public int withdraw(int amountToWithdraw) {
        balance -= amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
        savings.checkBalance();
        //Check balance:
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);

        //Withdrawing:
        savings.withdraw(300);
        // int afterWithdraw = savings.balance - 300;
        // savings.balance = afterWithdraw;
        // System.out.println("You just withdrew "+300);

        //Check balance:
        savings.checkBalance();
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);

        //Deposit:
        savings.deposit(600);
        // int afterDeposit = savings.balance + 600;
        // savings.balance = afterDeposit;
        // System.out.println("You just deposited "+600);

        //Check balance:
        savings.checkBalance();
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);

        //Deposit:
        savings.deposit(600);
        // int afterDeposit2 = savings.balance + 600;
        // savings.balance = afterDeposit2;
        // System.out.println("You just deposited "+600);

        //Check balance:
        savings.checkBalance();
        // System.out.println("Hello!");
        // System.out.println("Your balance is "+savings.balance);

    }
}

