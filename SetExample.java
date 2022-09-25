package set.examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> data = new LinkedHashSet<>();

        data.add("Set");
        data.add("Example");
        System.out.println(data);
    }
}
