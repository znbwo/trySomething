public class TryYield {
    public static void main(String[] args) {
        while (true) // Never releases lock
            Thread.yield();
    }
}
