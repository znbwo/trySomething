import java.math.BigDecimal;

/**
 * float*100 != float*100
 */
public class TryBigDecimal {

    static class Main {
        public static void main(String[] args) {
            BigDecimal b1 = new BigDecimal("9.86");
            float floatValue = b1.floatValue();
            System.out.println(floatValue * 100);
            BigDecimal b2 = new BigDecimal("100");
            BigDecimal multiply = b1.multiply(b2);
            System.out.println("multiply" + multiply.floatValue());

        }
    }
}
