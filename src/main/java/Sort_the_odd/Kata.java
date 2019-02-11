package Sort_the_odd;

import java.util.*;

public class Kata {
    public static int[] sortArray(int[] array) {
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd.add(array[i]);
            }
        }
        Collections.sort(odd);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = odd.get(index);
                index++;
            }
        }
        return array;
    }
}
