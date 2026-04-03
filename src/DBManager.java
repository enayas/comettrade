import java.util.HashMap;

public class DBManager
{
    private HashMap<String, User> users = new HashMap<>();

    public void storeUser(User user){
        users.put(user.getUsername(), user);
    }

    public User getUser(String name)
    {
        return users.get(name);
    }
}