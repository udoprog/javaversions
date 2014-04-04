package javaversions;

public class Java11 {
    public static String JAVA_VERSION = "1.1";

    public static void test() {
        System.out.println("test: " + JAVA_VERSION);
    }

    public static void testRunnable(Runnable runnable) {
        System.out.println("testRunnable: " + JAVA_VERSION);
        runnable.run();
    }

    public static void testCollections(Object collection) {
        System.out.println("testCollections: " + JAVA_VERSION);
        System.out.println("toString(): " + collection.toString());
    }
}
