/**
 * Created by zhiningbo on 2017/3/27.
 */
public class TryReturnFinally {
    private int num;

    int getVal() {
        try {
            return num;
        } finally {
            num++;
            System.out.println("haha.");
        }
    }

    public static void main(String[] args) {
        TryReturnFinally tryReturnFinally = new TryReturnFinally();
        int val = tryReturnFinally.getVal();
        System.out.println(val);
        System.out.println(tryReturnFinally.num);
    }

}
