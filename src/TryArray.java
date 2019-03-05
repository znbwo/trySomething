import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhiningbo on 2017/3/31.
 */
public class TryArray {

    private static void init() {
        int[] ints = {0, 1};
    }

    private static void arrayToList() {
        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
        System.out.println(stooges);
        Integer[] ints = {0, 1};
        List<Integer> list = Arrays.asList(ints);
        System.out.println(list);
    }


    public static void main(String[] args) {
        arrayToList();
    }
}
