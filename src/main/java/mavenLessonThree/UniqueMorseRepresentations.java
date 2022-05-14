package mavenLessonThree;

import java.util.TreeSet;

public class UniqueMorseRepresentations {

    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        TreeSet<String> set = new TreeSet<>();

        for (String word : words) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                result.append(morse[word.charAt(i) - 'a']);
            }
            set.add(result.toString());
        }
        return set.size();
    }
}
