
public class YourFirstAccount {

    public static void main(String[] args) {
        Account myAccount = new Account("Alex", 100.00);
        myAccount.deposit(20.00);
        System.out.println(myAccount);
    }
}
