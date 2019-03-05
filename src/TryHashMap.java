import java.util.HashMap;

/**
 * Created by zhiningbo on 2017/4/4.
 */
public class TryHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("a", 1);
        map.put("a", 2);
        System.out.println(map.get("a"));
    }
}
