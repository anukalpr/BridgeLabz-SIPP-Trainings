import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> items) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> input =new ArrayList<>();
        input.addAll(Arrays.asList("apple", "banana", "apple", "orange"));
        Map<String, Integer> result = countFrequency(input);
        System.out.println(result);
    }
}