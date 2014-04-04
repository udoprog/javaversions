package javaversions;

public class Java12 {
    public static String JAVA_VERSION = "1.2";

    public static void test() {
        System.out.println("test: " + JAVA_VERSION);
    }

    public static void testRunnable(Runnable runnable) {
        System.out.println("testRunnable: " + JAVA_VERSION);
        runnable.run();
    }
}
