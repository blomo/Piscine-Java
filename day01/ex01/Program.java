public class Program {

    public static void main(String[] args) {
        User user1 = new User("vasya",0);
        User user2 = new User("petya",0);
        System.out.println(user1.getId());
        System.out.println(user2.getId());
        System.out.println(UserIdsGenerator.getInstance().getId());
        User user3 = new User("petya1",0);
        System.out.println(user3.getId());
        System.out.println(UserIdsGenerator.getInstance().getId());
    }
}
