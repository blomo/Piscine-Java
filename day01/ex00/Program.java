
public class Program {

    public static void main(String[] args) {
        User user1 = new User(1, "Vasya");
        User user2 = new User(2, "Petya");
        user1.setBalance(100);
        user2.setBalance(600);
        user1.printBalance();
        user2.printBalance();
        Transaction transaction1 = new Transaction(user1, user2, 300);
        Transaction transaction2 = new Transaction(user1, user2, -300);
        System.out.println(transaction1.getIdentifier());
        System.out.println(transaction1.getAmount());
        System.out.println(transaction2.getIdentifier());
        System.out.println(transaction2.getAmount());
    }
}
