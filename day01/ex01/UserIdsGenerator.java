public class UserIdsGenerator {
    private static UserIdsGenerator instance;
    public int id;

    private UserIdsGenerator() {
        this.id = 0;
    }

    public static UserIdsGenerator getInstance() {
        if (instance == null) {
            instance = new UserIdsGenerator();
        }
        return instance;
    }

    public int generateId() {
        id = id + 1;
        return id;
    }

    public int getId() {
        return id;
    }
}
