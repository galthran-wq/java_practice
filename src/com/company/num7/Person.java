
import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private List<Furniture> cart = new ArrayList<>();

    public List<Furniture> getCart() {
        return cart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    Person(int id) {
        setId(id);
    }

    public void addItem(Furniture item) {
        cart.add(item);
    }

    public void removeItem(Furniture item) {
        cart.remove(item);
    }
}
