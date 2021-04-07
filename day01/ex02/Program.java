public class Program {
    public static void main(String[] args) {
        User user1 = new User("vasya");
        User user2 = new User("petya");
        User user3 = new User("vasya1");
        User user4 = new User("petya2");
        UsersArrayList array = new UsersArrayList();
        array.addUser(user1);
        array.addUser(user2);
        array.addUser(user3);
        array.addUser(user4);
        array.printall();
        System.out.println(array.RetrieveIndex(3).Name);
        System.out.println(array.RetrieveId(4).Name);
        System.out.println(array.RetrieveNumberUsers());
    }
}
