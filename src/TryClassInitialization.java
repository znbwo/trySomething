/**
 * Created by zhiningbo on 2017/3/5.
 * testkk
 * Run static { }
 * hhh
 * TryClassInitialization()
 * hhh
 * TryClassInitialization()
 */
public class TryClassInitialization {
    String value = "hi";


    static {
        kk = "kk";
        System.out.println("test" + TryClassInitialization.kk);
    }

    static String kk = "stringkk";


    public TryClassInitialization() {
        System.out.println("TryClassInitialization()");
    }

    {
        System.out.println("hhh");
    }

    void test(TryClassInitialization h) {
        System.out.println(h.value);
    }

}

class Run extends TryClassInitialization {
    static {
        System.out.println("Run static { }");
    }

    public static void main(String[] args) {
        new Run();
        new Run();
    }

}

