
public class Main {

    public static FurnitureShop getFurnitureShop() {
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.addItems(
                new Armchair("modern", "white", 500),
                new Armchair("old-fashioned", "black", 100),
                new Sofa("modern", "white", 600),
                new Sofa("old-fashioned", "black", 550)
        );
        return furnitureShop;
    }

    public static void main(String[] args) {
        FurnitureShop furnitureShop = getFurnitureShop();
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        person1.addItem(furnitureShop.findItem("Armchair", "modern", "white"));
        person2.addItem(furnitureShop.findItem("Sofa", "modern", "white"));
        System.out.println("Cart for person with id=" + person1.getId());
        for (Furniture item: person1.getCart()) {
            System.out.println("Furniture item:");
            item.showInfo();
        }
        System.out.println();
        System.out.println("Cart for person with id=" + person2.getId());
        for (Furniture item: person2.getCart()) {
            System.out.println("Furniture item:");
            item.showInfo();
        }
        System.out.println();
    }
}
