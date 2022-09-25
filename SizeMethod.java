package set.examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class SizeMethod {
    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(51);
        data.add(11);
        data.add(81);

        System.out.println("data: " + data);
        System.out.println("Size: " + data.size());
    }
}
