import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiningbo on 2017/3/31.
 */
public class TryQuote {
    public static void main(String[] args) {

//        test1();
//        test2();
        test3();
    }

    private static void test1() {
        String str = "hello";
        ArrayList<String> outer = new ArrayList();
        outer.add(str);
        str = null;
        System.out.println(outer.get(0));/*hello*/
    }

    private static void test2() {
        ArrayList<String> inner = new ArrayList();
        inner.add("hello");
        ArrayList<List> outer = new ArrayList();
        outer.add(inner);
        System.out.println(outer.get(0).size());/*1*/
        inner.clear();
        System.out.println(outer.get(0).size());/*0*/
    }

    private static void test3() {
        ArrayList<String> inner1 = new ArrayList();
        inner1.add("hello");
        ArrayList<List> outer = new ArrayList();
        outer.add(inner1);
        inner1 = new ArrayList<>();
        System.out.println(outer.get(0).size());/*1*/
    }
}
