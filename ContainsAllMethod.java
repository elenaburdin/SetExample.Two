package set.examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class ContainsAllMethod {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(51);
        data.add(11);
        data.add(81);

        System.out.println("data: " + data);

        Set<Integer> newData = new LinkedHashSet<>();
        newData.add(31);
        newData.add(21);
        newData.add(681);

        System.out.println("Does data contains newData? " + data.containsAll(newData));

    }
}
