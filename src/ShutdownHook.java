import java.util.concurrent.TimeUnit;

/**
 * Created by zhiningbo on 2017/4/1.
 */

public class ShutdownHook implements Runnable {
    public void run() {
        System.out.println("ShutdownHook execute start...");
        System.out.print("Netty NioEventLoopGroup shutdownGracefully...");
        try {
            TimeUnit.SECONDS.sleep(10);//模拟应用进程退出前的处理操作
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ShutdownHook execute end...");
        System.out.println("Sytem shutdown over, the cost time is 10000MS");
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ShutdownHook(), "ShutdownHook-Thread");
        Runtime.getRuntime().addShutdownHook(t);
        Thread.sleep(Integer.MAX_VALUE);
    }
}