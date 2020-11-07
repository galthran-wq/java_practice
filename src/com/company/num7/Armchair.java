
public class Armchair extends Furniture {


    public Armchair(String type, String color, double cost) {
        setType(type);
        setName("Armchair");
        setPrice(cost);
        setColor(color);
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + ": cost=" + getPrice() + " color=" + getColor() + " type=" + getType());
    }
}
