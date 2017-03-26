/**
 * Created by zhiningbo on 2017/3/27.
 */
public class TrySynchronized {
    synchronized void m1(){
        System.out.println("this is in m1");
    }

    synchronized void m2(){
        System.out.println("this is in m2");
        m2();
    }

    public static void main(String[] args) {
        new TrySynchronized().m2();
    }
}
