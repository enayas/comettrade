package src;

import java.util.HashMap;

public class User {
    private String username;
    private String password;
    private HashMap<String, Post> posts = new HashMap<>();

    public User (String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void addPost(String title, Post post){
        posts.put(name, post);
    }

    public Post getPost(String name){
        return posts.get(name);
    }

    public boolean hasPost(String title){
        posts.containsKey(title);
    }
}