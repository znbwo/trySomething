/**
 * Created by zhiningbo on 2017/3/5.
 */
public class H {
    String value = "hi";


    static {
        kk = "kk";
        System.out.println("test" + H.kk);
    }

    static String kk = "stringkk";


    public H() {
        System.out.println("H()");
    }

    {
        System.out.println("hhh");
    }

    void test(H h) {
        System.out.println(h.value);
    }

    static class Run {
        public static void main(String[] args) {
            H h = new H();
            H h1 = new H();
            System.out.println(h.kk);
        }

    }
}

