import java.io.Serializable;

/**
 * Created by zhiningbo on 2016/12/25.
 */
public abstract class Test extends Father implements Serializable,Runnable{
    public static void main(String[] args) {
        Class<?>[] interfaces = Test.class.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
//        System.out.println(interfaces.length);
    }
}
