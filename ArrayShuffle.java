import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7 };

        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);

        // Convert the list back to an array if needed
        array = list.toArray(new Integer[0]);

        // Print the shuffled array
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}