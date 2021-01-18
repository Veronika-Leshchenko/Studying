package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        HashSet<Integer> b = new HashSet<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);

        CollectionUtils utils = new CollectionUtilslmpl();
        Collection<Integer> unionResult = utils.union(a, b);
        System.out.println(unionResult);

        Collection<Integer> intersectionResult = utils.intersection(a, b);
        System.out.println(intersectionResult);

        Collection<Integer> unionWithoutDuplicateResult = utils.unionWithoutDuplicate(a, b);
        System.out.println(unionWithoutDuplicateResult);

        Collection<Integer> intersectionWithoutDuplicateResult = utils.intersectionWithoutDuplicate(a, b);
        System.out.println(intersectionWithoutDuplicateResult);

        Collection<Integer> differenceResult = utils.difference(a, b);
        System.out.println(differenceResult);
    }
}
