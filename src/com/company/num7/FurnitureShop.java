
import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
   private List<Furniture> furnitureItems = new ArrayList<> ();

  public void addItem(Furniture item) {
     furnitureItems.add(item);
  }

  public void addItems(Furniture ... items) {
      for (Furniture item: items) {
          addItem(item);
      }
  }

  public Furniture findItem(String name, String type, String color) {
      for (Furniture item: furnitureItems) {
          if (item.getName() == name && item.getType() == type && item.getColor() == color) {
              return item;
          }
      }
      return null;
  }
}
