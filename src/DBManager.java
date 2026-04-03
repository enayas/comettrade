import java.util.HashMap;

public class DBManager
{
    private HashMap<String, User> users = new HashMap<>();

    public void storeUser(User user){
        users.put(user.getUsername(), user);
    }

    public void storePost(String name, Post post)
    {
        users.get(name).addPost(post);
    }

    public User getUser(String name)
    {
        return users.get(name);
    }
}