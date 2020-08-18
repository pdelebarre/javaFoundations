package sets;

import java.util.Collection;
import java.util.HashSet;

public class TestSet {
    private static Collection<String> myCollection = new HashSet<>();

    public static void main(String[] args) {
        myCollection.add("bonjour");
        myCollection.add("hi");
        System.out.println(myCollection.contains("hi")
        );
        myCollection.remove("hi");
        Collection<String> c = new HashSet<String>();
        c.add("hola");
        c.add("hello");
        c.add("bonjour");
        myCollection.addAll(c); //only once

        myCollection.forEach(s -> System.out.println(s));
    }
}
