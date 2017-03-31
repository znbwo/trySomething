import java.io.*;

/**
 * Created by zhiningbo on 2017/3/31.
 * 枚举单例的优点:
 * 反序列化后仍是单例
 * 线程安全
 * 不可clone
 * 不可反射  class.instance()
 */
public enum TryEnum implements Serializable {

    INSTANCE {
        @Override
        protected void read() {
            System.out.println("read");
        }

        @Override
        protected void write() {
            System.out.println("write");
        }

    };

    protected abstract void read();

    protected abstract void write();
}

class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test"));
        objectOutputStream.writeObject(TryEnum.INSTANCE);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test"));
        Object o = objectInputStream.readObject();
        TryEnum tryEnum = (TryEnum) o;
        tryEnum.read();
        System.out.println(TryEnum.INSTANCE == o);
//        TryEnum newInstance = TryEnum.class.newInstance();
//        System.out.println(TryEnum.INSTANCE == newInstance);
    }
}
