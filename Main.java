import javaversions.Java11;
import javaversions.Java12;
import javaversions.Java13;
import javaversions.Java14;
import javaversions.Java15;
import javaversions.Java16;

public class Main {
    public static void main(String[] args) {
        System.out.println("# Invoking function");
        Java11.test();
        Java12.test();
        Java13.test();
        Java14.test();
        Java15.test();
        Java16.test();

        System.out.println("# Passing Runnable");

        final Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("runnable: OK");
            }
        };

        Java11.testRunnable(runnable);
        Java12.testRunnable(runnable);
        Java13.testRunnable(runnable);
        Java14.testRunnable(runnable);
        Java15.testRunnable(runnable);
        Java16.testRunnable(runnable);
    }
}
