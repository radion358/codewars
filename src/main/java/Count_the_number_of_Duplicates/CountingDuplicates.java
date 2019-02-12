package Count_the_number_of_Duplicates;

import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        List<Character> characters = new ArrayList<>();
        Set<Character> duplicatedCharacters = new HashSet<>();
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            if (characters.contains(text.charAt(i))) {
                duplicatedCharacters.add(text.charAt(i));
            }else characters.add(text.charAt(i));
        }
        return duplicatedCharacters.size();
    }
}
