public class Program {

    public static void main(String[] args) {
        User user1 = new User("vasya");
        User user2 = new User("petya");
        System.out.println(user1.getId());
        System.out.println(user2.getId());
        System.out.println(UserIdsGenerator.getInstance().getId());
        User user3 = new User("petya1");
        System.out.println(user3.getId());
        System.out.println(UserIdsGenerator.getInstance().getId());
    }
}
