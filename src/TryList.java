import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiningbo on 2017/3/31.
 */
public class TryList {
    private static List<Integer> list = new ArrayList<>();

    static {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    private static void test() {
        Object[] array = list.toArray();
        for (Object o : array) {
            System.out.println((int)o);
        }
        System.out.println(array);
    }

    private static void test2() {
        Integer list2[] = new Integer[list.size()];
        list2 = list.toArray(list2);
        System.out.println(list2);
    }

    public static void main(String[] args) {
        test2();
    }
}
