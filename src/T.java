import java.io.IOException;

/**
 * Created by zhiningbo on 2017/3/14.
 */
public class T {
    int num;

    public T() throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                say();
            }
        }).start();
        Thread.sleep(1000);
        this.num = 9;
    }

    private void say() {
        System.out.println(this.num);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        T t = new T();
        System.out.println(t.num);


    }
}

