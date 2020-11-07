
public class Sofa extends Furniture {
    private String name;
    private String type;

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

    public Sofa(String type, String color, double cost) {
        setType(type);
        setName("Sofa");
        setPrice(cost);
        setColor(color);
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + ": cost=" + getPrice() + " color=" + getColor() + " type=" + getType());
    }
}
