package ordering;

import java.util.Comparator;

public class CustomIntegerComparator implements Comparator<Integer> {
    private static int order=1;

    public CustomIntegerComparator(int i) {
        order=i;
    }

    public int compare(Integer o1, Integer o2) {
        return o1>o2?order:-order; //descending
    }
}
