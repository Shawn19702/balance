package accounting;

public class Account {
    private double balance;


    public Account() {

    }

    public double getBalance() {
            return balance;
    }


    public void setBalance(double balance) {
        if (balance > 0.0) {
            this.balance = balance;
        }

    }


}
















