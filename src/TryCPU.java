import com.alibaba.fastjson.util.IOUtils;
import org.springframework.util.FileCopyUtils;

import java.io.*;

import static javafx.scene.input.KeyCode.F;

/**
 * Created by zhiningbo on 2017/3/30.
 */
public class TryCPU {
    private static void runCPU() {
        while (true) {//96%CPU

        }
    }

    private static void runStore() throws IOException {
        File result = new File("result");
        if (!result.exists()) {
            result.createNewFile();
        }
        FileWriter writer = new FileWriter(result, true);
        while (true) {
            writer.append("test test test test test test test test test test test test test test test test test test test test ");
            writer.flush();
        }
    }

    private static void runCopy() throws IOException {
        File result = new File("copy");
        if (!result.exists()) {
            result.createNewFile();
        }

        File in = new File("result");
        System.out.println(in.exists());
        FileCopyUtils.copy(in, new File("copy"));
    }

    public static void main(String[] args) throws IOException {
//        TryCPU.runStore();
        TryCPU.runCopy();
    }
}
