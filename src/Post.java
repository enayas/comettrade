import java.lang.Math;

public class Post
{
    private double price;
    private String title;
    private String description;
    
    public Post()
    {
        
    }
    
    public String createPost(double price, String title, String description)
    {
        if((price<1&&price>10000)||(fmod(price, 0.01))!=0||(title.length()>40&&title.length<1)||description.length()>300)
        {
            return "A field has an incorrect input, please try again.\n";
        }
        this.price = price;
        this.title = title;
        this.description = description;
        return "A new post has been created.\n";
    }

    public String getName()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }

    public String getDescription()
    {
        return description
    }

    @Override
    public String toString()
    {
        return "Product: " + "\n" + "Price: " + price + "$\n" 
            + "Description: " + description + "\n";
    }
}