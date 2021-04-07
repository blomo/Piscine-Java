public class Program {
    public static void main(String[] args) {
        User user1 = new User("vasya");
        User user2 = new User("petya");
        User user3 = new User("vasya1");
        User user4 = new User("petya2");
        Transaction test1 = new Transaction(user1, user2, 100);
        Transaction test2 = new Transaction(user1, user3, 1000);
        Transaction test3 = new Transaction(user1, user3, 1000);
        TransactionsLinkedList data = new TransactionsLinkedList();
        data.addTransaction(test1);
        data.addTransaction(test2);
        data.addTransaction(test3);
//        user1.operation.addTransaction(test1);
        data.print();
        System.out.println("-----------------------");
        System.out.println(test3.Identifier);
        data.removeTransaction(test3.Identifier);
        data.print();
        System.out.println("-----------------------");
        data.addTransaction(test3);
        System.out.println("-----------------------");
        data.print();
        System.out.println("-----------------------");
        Transaction[] tttt = data.transformTransactionToArray();
        for (int i = 0; i < tttt.length; i++) {
            System.out.println(tttt[i].Identifier);
        }
        System.out.println("-----------------------");
        data.removeTransaction(test3.Identifier);
        data.removeTransaction(test2.Identifier);
        data.print();

        System.out.println("-----------------------");
        System.out.println("-----------------------");

        System.out.println("-----------------------");
        System.out.println("-----------------------");

        System.out.println("-----------------------");
        System.out.println("-----------------------");
        Transaction[] tttt1 = data.transformTransactionToArray();
        for (int i = 0; i < tttt1.length; i++) {
            System.out.println(tttt1[i].Identifier);
        }
    }
}
