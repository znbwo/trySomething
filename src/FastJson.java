import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhiningbo on 2017/3/15.
 */
public class FastJson {
    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        object.put("age", 18);
        System.out.println(JSON.toJSONString(object));
        JSONObject parse = (JSONObject) JSON.parse(JSON.toJSONString(object));
        System.out.println(parse.get("age"));
    }
}
