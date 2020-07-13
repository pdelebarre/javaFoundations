package collections.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestArray {
    static Collection<Animal> list = new ArrayList<Animal>();

    public static void main(String[] args) {
        list.add(new Dog());
        list.add(new Cat());
        list.add(new Cow());

        //for loop
        System.out.println("for");
        for(Animal animal: list){
            System.out.println(animal.says());
        }

        //iterable
        System.out.println("\niterable");
        Iterator<Animal> animalIterable = list.iterator();
        while(animalIterable.hasNext()) {
            System.out.println(animalIterable.next().says());
        }

        //foreach
        System.out.println("\nlist.foreach");
        list.forEach(a-> System.out.println(a.says()));

    }
}
