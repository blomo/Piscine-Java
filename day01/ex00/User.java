public class User {
    Integer Identifier;
    String Name;
    Integer Balance;

    User(int i, String name) {
        this.Identifier = i;
        this.Name = name;

    }

    public void setBalance(int balance) {
        if (balance < 0) {
            balance = 0;
        }
        this.Balance = balance;
    }

    public int getBalance(int sum) {
        return Balance;
    }

    public void printBalance() {
        System.out.println(Balance);
    }
}