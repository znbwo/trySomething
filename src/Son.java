import java.io.FileNotFoundException;
import java.io.Serializable;

import static java.lang.System.out;

/**
 * Created by zhiningbo on 2016/11/12.
 */
public class Son extends Father {
    public int num = 10;

    Son() {

    }

    public Son(CharSequence charSequence) {
        out.println("charSequence");
    }

    //    public Son(String string) {
//        System.out.println("string");
//    }
    public static void show() {
        System.out.println("son show()");
    }
}

class Demo implements Serializable {
    public static void main(String[] args) throws FileNotFoundException {
        Son son = new Son();
        System.out.println(son.num);
        son.show();
        System.out.println("------------");
        Father father = son;
        System.out.println(father.num);
        father.show();

//        String digiStr = new String(new byte[]{66, 67});
//        String chariStr = new String(new char[]{'a', 'b'});
//        char[] chars = {65, 66};
//        System.out.println((char)65);
//        System.out.println((char)66);
//        char[] char2 = {'A', 'B'};
//        boolean equals = chars.equals(char2);
//        System.out.println(equals);
//        new Son("");
//        System.out.println(Math.PI);
//        Math.random();
//        while (true) {
//            System.exit(9);
//            System.gc();
//            System.out.println();
//        }

//        try {
//            System.exit(9);
//        } catch (Exception e) {
//
//
//        } finally {
//            System.out.println("still live");
//        }


//        System.out.println(new Date(0));
//        char[] a = {1, 2};
//        System.out.println(a.length);
//        System.out.println("aa".length());

//        HashSet<Object> hashSet = new HashSet<>();
//        hashSet.add(Math.E);


//        int 数=100_111;
//        System.out.println(数+1);


//        int a=0;
//        int b=1;
//        b=a;
//        a = 2;
//        System.out.println(b);


//        new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("this:" + this);
//                System.out.println(this.getClass().getName());
//            }
//        }.run();


//        new Hashtable<>();

//        try {
//            int a = 1 / 0;
//        } catch (ArithmeticException | RuntimeException e) {
//            System.out.println(e.getClass().getName());
//            e.printStackTrace();
//        }

//throw 之后不会执行
//        throw new RuntimeException();
//        System.gc();
//        int a = 9 / -1;
//        System.out.println(a);
//        File file = new File("");
//        BufferedInputStream bufferedInputStream = null;
//        try {
//             bufferedInputStream = new BufferedInputStream(new FileInputStream(""));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
////        bufferedInputStream.read();
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(""));
//        try {
//            bufferedOutputStream.flush();
//            bufferedOutputStream.write(1);
//        } catch (IOException e) {
//           e.printStackTrace();
//        }
        Thread thread = new Thread();
//        thread.sleep(100);
    }
}