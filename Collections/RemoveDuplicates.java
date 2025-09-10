import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 5, 3));
        List<Integer> result = removeDuplicates(list);
        System.out.println(result);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> output = new ArrayList<>();
        for (Integer item : list) {
            if (!output.contains(item)) {
                output.add(item);
            }
        }
        return output;
    }
}
