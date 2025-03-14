package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {

        Set<Integer> lotto2 = new TreeSet<>();

        for (int i = 0; lotto2.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            // lotto1.add(num);
            lotto2.add(num);
            System.out.print(i);
        }

        System.out.println(lotto2);
        // TreeSet : [4, 6, 23, 28, 32, 41]

    }
}
