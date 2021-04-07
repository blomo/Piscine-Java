public interface UsersList {
    public void addUser(User new_user);

    public User RetrieveId(int id);

    public User RetrieveIndex(int id);

    public int RetrieveNumberUsers();
}
