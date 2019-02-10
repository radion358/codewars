package Highest_and_Lowest;

import java.util.Arrays;
import java.util.List;

public class Kata {
    static String HighAndLow(String numbers) {
        List<String> splittedNumbers = Arrays.asList(numbers.split(" "));
        int min = splittedNumbers.stream().mapToInt(s -> Integer.parseInt(s))
                .min().orElseThrow(RuntimeException::new);
        int max = splittedNumbers.stream().mapToInt(s -> Integer.parseInt(s))
                .max().orElseThrow(RuntimeException::new);
        return max + " " + min;
    }
}
