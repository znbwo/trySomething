import java.util.HashMap;
import java.util.Map;

public class TryHashCollision {
    public static void main(String[] args) {
        String atatatatatatatat = "atatatatatatatat";
        String c6atatatatatatbU = "c6atatatatatatbU";
        System.out.println(atatatatatatatat.hashCode());
        System.out.println(c6atatatatatatbU.hashCode());
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(atatatatatatatat, 2);
        hashMap.put(c6atatatatatatbU, 1);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("----------");
        System.out.println(hashMap.get(atatatatatatatat));
        System.out.println(hashMap.get(c6atatatatatatbU));
        System.out.println("========");
        System.out.println(2%6);
    }
}
