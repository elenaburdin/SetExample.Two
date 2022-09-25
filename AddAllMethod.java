package set.examples;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddAllMethod {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<>();
        data.add(31);
        data.add(21);
        data.add(41);
        System.out.println("Set: " + data);

        ArrayList<Integer> newData = new ArrayList<>();
        newData.add(91);
        newData.add(71);
        newData.add(81);
        data.addAll(newData);
        System.out.println("Set addAll: " + data);
    }
}
