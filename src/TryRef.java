import java.util.Vector;

public class TryRef {
    public static void main(String[] args) {
        Vector v=new Vector(10);
        for (int i=1;i<100; i++)
        {
            Object o=new Object();
            v.add(o);
            o=null;
        }
        System.out.println(v);
    }

}
