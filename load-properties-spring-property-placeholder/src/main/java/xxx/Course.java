package xxx;

public class Course {
    private String name;
    private String description;
    private String price;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" + 
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", price='" + price + '\'' + 
            '}';
    }
}
