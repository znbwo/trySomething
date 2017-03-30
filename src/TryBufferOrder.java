import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Created by zhiningbo on 2017/3/30.
 */
public class TryBufferOrder {
    public static void main(String[] args) {
        System.out.println("当前系统order=" + ByteOrder.nativeOrder());

        ByteBuffer buffer = ByteBuffer.allocate(20);

        // 获取默认的byte顺序
        ByteOrder order = buffer.order(); //
        System.out.println("当前order=" + order);

//        buffer.putShort(0, (short) 1);
//        System.out.println("此时取出0:" + buffer.get(0));
//        System.out.println("此时取出1:" + buffer.get(1));
        buffer.putInt(0, 1);//int 占4个字节
        buffer.putInt(4, 1);
        System.out.println("此时取出0:" + buffer.get(0));
        System.out.println("此时取出1:" + buffer.get(1));
        System.out.println("此时取出2:" + buffer.get(2));
        System.out.println("此时取出3:" + buffer.get(3));
        System.out.println("此时取出4:" + buffer.get(4));
        System.out.println("此时取出5:" + buffer.get(5));
        System.out.println("此时取出6:" + buffer.get(6));
        System.out.println("此时取出7:" + buffer.get(7));
        System.out.println("-----------");
        buffer = ByteBuffer.allocate(20);
        buffer.putInt(0, 1);//int 占4个字节
        buffer.putInt(1, 1);
        System.out.println("此时取出0:" + buffer.get(0));
        System.out.println("此时取出1:" + buffer.get(1));
        System.out.println("此时取出2:" + buffer.get(2));
        System.out.println("此时取出3:" + buffer.get(3));
        System.out.println("此时取出4:" + buffer.get(4));
        System.out.println("此时取出5:" + buffer.get(5));
        System.out.println("此时取出6:" + buffer.get(6));
        System.out.println("此时取出7:" + buffer.get(7));
        /**
         * 此时取出0:0
         此时取出1:0
         此时取出2:0
         此时取出3:1
         此时取出4:0
         此时取出5:0
         此时取出6:0
         此时取出7:1
         -----------
         此时取出0:0
         此时取出1:0
         此时取出2:0
         此时取出3:0
         此时取出4:1
         此时取出5:0
         此时取出6:0
         此时取出7:1
         **/

    }
}
