public class User {
    private Integer id;
    private String Name;
    private Integer Balance;

    User(String name, int sum) {
        this.id = UserIdsGenerator.getInstance().generateId();
        this.Name = name;
        if (sum < 0) {
            this.Balance = 0;
        } else {
            this.Balance = sum;
        }


    }

    public int getId() {
        return this.id;
    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public int getBalance() {
        return this.Balance;
    }

    public void printBalance() {
        System.out.println(Balance);
    }

}