import org.junit.*;

/**
 * Created by zhiningbo on 2016/11/20.
 */
public class JunitTest {
    static {
        System.out.println("from static{}");
    }

    public JunitTest() {
        System.out.println("from constructer()");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("from beforeClass");
    }

    @org.junit.Test
    public void test() {
    }
}
