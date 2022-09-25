package set.examples;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveAllMethod {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(51);
        data.add(11);
        data.add(81);

        System.out.println("data: " + data);

        ArrayList<Integer> newData = new ArrayList<>();
        newData.add(51);
        newData.add(11);
        newData.add(31);

        data.removeAll(newData);
        System.out.println("data after removing newData elements: " + data);
    }
}
