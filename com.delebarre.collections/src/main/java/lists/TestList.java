package lists;

import java.util.*;
import java.util.stream.Stream;

public class TestList {
    List listA = new ArrayList();
    List listB = new LinkedList();
    List listC = new Vector();
    List listD = new Stack();

    TestList(){
        listA.add(1);
        listA.add(5);
        listA.add(365);
        listA.add(77);
        listA.add(1432);
        listA.add(1);

        listB.addAll(listA);

        listC.addAll(listA);
    }

    public static void main(String[] args) {
        TestList t = new TestList();
        System.out.println("//// ArrayList");
        t.listA.forEach(i -> System.out.println(i));
        System.out.println(t.listA.indexOf(365));

        System.out.println("\n//// LinkedList");
        Collections.sort(t.listB);
        t.listB.forEach(i -> System.out.println(i));

        System.out.println("\n//// Vector");
        Stream<Integer> stream = t.listC.stream();
        stream.forEach(e -> System.out.println(e));

        System.out.println("\n//// List to Set");
        Set s = new HashSet();
        s.addAll(t.listA);
        for (Object o : s) {
            System.out.println(o);

        }
    }
}
