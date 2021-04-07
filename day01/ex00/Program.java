public class Program {

    public static void main(String[] args) {
        User user1 = new User(1, "Vasya",100);
        User user2 = new User(2, "Petya",200);
        User user3 = new User(2, "Petya",-2200);
        System.out.println(user1.getBalance());
        System.out.println(user3.getBalance());

        user3.setBalance(5000);
        System.out.println(user3.getBalance());

        Transaction transaction1 = new Transaction(user1, user2, 300);
        Transaction transaction2 = new Transaction(user1, user2, -300);

        System.out.println(transaction1.getIdentifier());
        System.out.println(transaction1.getAmount());
        System.out.println(transaction1.getCategory());
        System.out.println(transaction1.getRecipient().getName());
        System.out.println(transaction1.getSender().getName());

        System.out.println(transaction2.getIdentifier());
        System.out.println(transaction2.getAmount());
        System.out.println(transaction2.getCategory());
        System.out.println(transaction2.getRecipient().getName());
        System.out.println(transaction2.getSender().getName());
    }
}
