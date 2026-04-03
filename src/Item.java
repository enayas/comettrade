public class Item {
    private String title;
    private String category;
    private double price;
    private String condition;
    private String location;
    private long createdAt;

    public Item(String title, String category, double price, String condition, String location, long createdAt) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.condition = condition;
        this.location = location;
        this.createdAt = createdAt;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getCondition() {
        return condition;
    }

    public String getLocation() {
        return location;
    }

    public long getCreatedAt() {
        return createdAt;
    }
}
