import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhiningbo on 2016/11/10.
 */
public class CollectionRemoveTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == 3) {
//                iterator.remove();
                integers.remove(next);
                System.out.println("in loop size :" + integers.size());
            } else {
                System.out.println("data is :"+next);
            }
        }

        System.out.println("after loop size :" + integers.size());
    }
}
