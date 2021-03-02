import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Min implements Function<ArrayList<Integer>, Integer> {

    @Override
    public Integer apply(ArrayList<Integer> ints) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer anInt : ints) {
            if (!newList.contains(anInt)) {
                newList.add(anInt);
            }
        }
        Collections.sort(newList);
        int total = 0;
        for (Integer i : newList) {
            total = 10*total + i;
        }
        return total;
    }

    public static void main(String[] args) {
        Function<ArrayList<Integer>, Integer> min = new Min();
        ArrayList<Integer> init = new ArrayList<Integer>();
        init.add(1);
        init.add(3);
        init.add(1);
        Integer result = min.apply(init);
        System.out.println(result);
    }
}
