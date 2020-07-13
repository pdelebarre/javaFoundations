package ordering;

import java.util.PriorityQueue;
import java.util.Queue;

public class NaturalOrdering {
    public static void main(String[] args) {
        testStringNaturalOrdering();
    }

    public static void testStringNaturalOrdering() {
        Queue<String> testStringsPQ = new PriorityQueue<String>();
        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");

        System.out.println("Strings stored in natural ordering in priority queue\n");
        while (!testStringsPQ.isEmpty()){
            System.out.println(testStringsPQ.poll());
        }
    }
}
