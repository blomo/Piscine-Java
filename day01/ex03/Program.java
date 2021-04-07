public class Program {
    public static void main(String[] args) {
        User user1 = new User("vasya", 0);
        User user2 = new User("petya", 0);
        User user3 = new User("vasya1", 0);
        User user4 = new User("petya2", 0);
        Transaction test1 = new Transaction(user1, user2, 100);
        Transaction test2 = new Transaction(user1, user3, 1000);
        Transaction test3 = new Transaction(user1, user3, 1000);
        TransactionsLinkedList data = new TransactionsLinkedList();
        data.addTransaction(test1);
        data.addTransaction(test2);
        data.addTransaction(test3);
        data.print();
        System.out.println("-----------------------");
        System.out.println(test3.getIdentifier());
        data.removeTransaction(test3.getIdentifier());
        data.print();
        System.out.println("-----------------------");
        data.addTransaction(test3);
        System.out.println("-----------------------");
        data.print();
        System.out.println("-----------------------");
        Transaction[] tttt = data.transformTransactionToArray();
        for (int i = 0; i < tttt.length; i++) {
            System.out.println(tttt[i].getIdentifier());
        }
        System.out.println("-----------------------");
        data.removeTransaction(test3.getIdentifier());
        data.removeTransaction(test2.getIdentifier());

        data.print();

        System.out.println("-----------------------");

        Transaction[] tttt1 = data.transformTransactionToArray();
        for (int i = 0; i < tttt1.length; i++) {
            System.out.println(tttt1[i].getIdentifier());
        }
    }
}
