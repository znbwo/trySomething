/**
 * Created by zhiningbo on 2016/11/12.
 */
public class Father {
    public Father() {
        System.out.println("Father()");
    }

    public int num = 5;

    public static void show() {
        System.out.println("father show()");
    }

    public void say() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.say();
    }
}
