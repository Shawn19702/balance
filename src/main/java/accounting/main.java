package accounting;

public class main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(-3);
        System.out.println(account.getBalance());
    }
}
