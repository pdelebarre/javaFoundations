package ordering;

import java.util.PriorityQueue;
import java.util.Queue;

public class NaturalOrderingWithComparator {
    public static void main(String[] args) {
        testIntegerNaturalOrderingDesc();
        testIntegerNaturalOrderingAsc();
    }

    public static void testIntegerNaturalOrderingDesc() {
        Queue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator(-1));
        testIntegersPQ.add(11);
        testIntegersPQ.add(5);
        testIntegersPQ.add(-1);
        testIntegersPQ.add(12);
        testIntegersPQ.add(6);

        System.out.println("Integers stored in reverse order of priority in a Priority Queue\n");
        while (!testIntegersPQ.isEmpty()) {
            System.out.println(testIntegersPQ.poll());
        }
    }

    public static void testIntegerNaturalOrderingAsc() {
        Queue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator(1));
        testIntegersPQ.add(11);
        testIntegersPQ.add(5);
        testIntegersPQ.add(-1);
        testIntegersPQ.add(12);
        testIntegersPQ.add(6);

        System.out.println("Integers stored in order of priority in a Priority Queue\n");
        while (!testIntegersPQ.isEmpty()) {
            System.out.println(testIntegersPQ.poll());
        }
    }
}
