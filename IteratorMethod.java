package set.examples;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorMethod {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(51);
        data.add(11);
        data.add(81);

        System.out.println("data: " + data);

        Iterator newData = data.iterator();
        System.out.println("The NewData values are: ");
        while (newData.hasNext()) {
            System.out.println(newData.next());
        }

        }
}
