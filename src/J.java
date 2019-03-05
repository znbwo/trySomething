public class J {
    private static J ourInstance = new J();

    public static J getInstance() {
        return ourInstance;
    }

    private J() {
    }

    private synchronized void run() {
        synchronized (this) {
            System.out.println("\"\"\"\"");
            synchronized (this) {
                System.out.println("\"\"\"\"");
            }
        }
    }

    public static void main(String[] args) {
        new J().run();

    }

    public void dynmaArgs(int ... args ) {

    }
}