import java.math.BigDecimal;

import static javafx.scene.input.KeyCode.M;

public class Main {
    private String name = "jack";

    public void test() {
        System.out.println(name);
    }


    static class BB {
        public static void main(String[] args) {
            BigDecimal b1 = new BigDecimal("9.86");
            BigDecimal b2 = new BigDecimal("100");
            float floatValue = b1.floatValue();
            System.out.println(floatValue * 100);
        }
    }
}
