public class Customer {
    private String Name;
    private String type;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Customer(String type, String Name) {
        this.Name = Name;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
