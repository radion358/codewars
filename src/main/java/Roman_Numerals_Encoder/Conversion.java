package Roman_Numerals_Encoder;

public class Conversion {
    private final static String[] ROMAN = {"M", "D", "C", "L", "X", "V", "I"};
    private final static int[] ARABIC = {1000, 500, 100, 50, 10, 5, 1};

    public String solution(int n) {
        StringBuilder result = new StringBuilder();
        if ((n > 3999) || (n <= 0)) {
            throw new IllegalArgumentException();
        }

        int i = 0;
        while (i <= ARABIC.length - 1) {

            if (n >= ARABIC[i]) {
                result.append(ROMAN[i]);
                n -= ARABIC[i];
            } else if ((i < ARABIC.length - 2)
                    && (i % 2 == 0)
                    && (n >= (ARABIC[i] - ARABIC[i + 2]))) {
                result.append(ROMAN[i + 2]);
                result.append(ROMAN[i]);
                n -= ARABIC[i] - ARABIC[i + 2];
                i++;
            } else if (((i % 2) == 1)
                    && (n >= (ARABIC[i] - ARABIC[i + 1]))) {
                result.append(ROMAN[i + 1]);
                result.append(ROMAN[i]);
                n -= ARABIC[i] - ARABIC[i + 1];
                i++;
            }else i++;
        }
        return result.toString();
    }
}
