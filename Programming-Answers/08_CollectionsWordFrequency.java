import java.util.*;
public class CollectionsWordFrequency {
    public static void main(String[] args) {
        String sentence = "java is object oriented and java is portable";
        Map<String, Integer> frequency = new TreeMap<>();
        for (String word : sentence.split("\\s+"))
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        frequency.forEach((word, count) -> System.out.println(word + " = " + count));
    }
}
