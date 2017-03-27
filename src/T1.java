import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhiningbo on 2017/3/9.
 */
public class T1 {
    public int getAge() {
        return 1;
    }
    public static void main(String[] args) {
        List<String> elements = new ArrayList();
        elements.add("a");
        elements.add("b");
        elements.add("c");
        String joined = elements.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(joined);
        elements.stream().mapToInt(String::hashCode).average();
        Collectors.reducing(0, T1::getAge, Integer::sum);
    }
}
