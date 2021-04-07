public class UsersArrayList implements UsersList {
    private User[] data;

    UsersArrayList() {
        this.data = new User[10];
    }

    public void addUser(User new_user) {
        int len = data.length;
        int i = 0;
        for (; i < len; i++) {
            if (data[i] == null) {
                data[i] = new_user;
                break;
            }
        }
        if (i == len) {
            User[] temp = new User[len * 2];
            for (i = 0; i < len; i++) {
                temp[i] = data[i];
            }
            temp[i] = new_user;
            data = temp;
        }
    }

    public void printall() {
        int len = data.length;
        for (int i = 0; i < len; i++) {
            if (data[i] != null)
                System.out.println(data[i].getName());
        }
    }

    public User RetrieveId(int id) {
        User temp = null;
        int len = data.length;
        for (int i = 0; i < len; i++) {
            if (data[i] != null && data[i].getId() == id)
                return data[i];
        }
        System.out.println("UserNotFoundException");
        return null;
    }

    public User RetrieveIndex(int id) {
        User temp = null;
        try {
            temp = data[id];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("UserNotFoundException");
        }
        return temp;
    }

    public int RetrieveNumberUsers() {
        int count = 0;
        int len = data.length;
        for (int i = 0; i < len; i++) {
            if (data[i] != null)
                count++;
        }
        return count;
    }
}