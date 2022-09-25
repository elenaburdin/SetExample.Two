package set.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Integer[] A = {22, 45, 33, 66, 55, 34, 77};
        Integer[] B = {33, 2, 83, 45, 3, 12, 55};

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(A));

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(B));

        // Union of set1 and set2
        Set<Integer> unionData = new HashSet<>(set1);
        unionData.addAll(set2);
        System.out.print("Union of set1 and set2 is ");
        System.out.println(unionData);

        // Intersection of set1 and set2
        Set<Integer> intersectionData = new HashSet<>(set1);
        intersectionData.retainAll(set2);
        System.out.print("Intersection of set1 and set2 is ");
        System.out.println(intersectionData);

        // difference between set1 and set2
        Set<Integer> differenceData = new HashSet<>(set1);
        differenceData.removeAll(set2);
        System.out.print("Difference of set1 and set2 is ");
        System.out.println(differenceData);
    }
}
