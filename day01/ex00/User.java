public class User {
    Integer Identifier;
    String Name;
    Integer Balance;

    User(int i, String name, int sum) {
        this.Identifier = i;
        this.Name = name;
        if (sum < 0) {
            System.err.println("User balance cannot be negative");
            System.exit(-1);
        }
        this.Balance = sum;

    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }

    public int getBalance(int sum) {
        return Balance;
    }

    public void printBalance() {
        System.out.println(Balance);
    }
}