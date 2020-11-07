
public abstract class Furniture {
    private String color;
    private double price;
    private String name;
    private String type;

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String type) {
        this.color = type;
    }

    public abstract void showInfo();
}
