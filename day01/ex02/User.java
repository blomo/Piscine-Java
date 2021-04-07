public class User {
    private Integer id;
    String Name;
    Integer Balance;

    User(String name) {
        this.id = UserIdsGenerator.getInstance().generateId();
        this.Name = name;

    }

    public void setBalance(int balance) {
        if (balance < 0) {
            balance = 0;
        }
        this.Balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance(int sum) {
        return Balance;
    }

    public void printBalance() {
        System.out.println(Balance);
    }

}