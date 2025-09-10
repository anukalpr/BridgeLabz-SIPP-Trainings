import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));
        int n = 2;
        rotateRight(list, n);
        System.out.println(list);
    }

    public static void rotateRight(List<Integer>list, int n) {
        int len = list.size();
        n = n % len;
        reverse(list, 0, len - 1);
        reverse(list, 0, n - 1);
        reverse(list, n, len - 1);
    }

    public static void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
}
