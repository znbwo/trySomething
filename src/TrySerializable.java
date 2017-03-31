import java.io.*;

/**
 * Created by zhiningbo on 2017/3/31.
 */
public class TrySerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test"));
        objectOutputStream.writeObject("hello world");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test"));
        Object o = objectInputStream.readObject();
        System.out.println(o);
    }
}
