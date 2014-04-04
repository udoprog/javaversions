import javaversions.Java11;
import javaversions.Java12;
import javaversions.Java13;
import javaversions.Java14;
import javaversions.Java15;
import javaversions.Java16;

import java.util.Collection;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        test();
        testRunnable();
        testCollections();
    }

    public static void test() {
        System.out.println("# Invoking function: 1.1+");
        Java11.test();
        Java12.test();
        Java13.test();
        Java14.test();
        Java15.test();
        Java16.test();
    }

    public static void testRunnable() {
        System.out.println("# Passing Runnable: 1.1+");

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

    public static void testCollections() {
        System.out.println("# Passing Collection: 1.2+");

        Collection<Object> collection = new ArrayList<Object>();

        collection.add((Object)42);

        Java11.testCollections(collection);
        Java12.testCollections(collection);
        Java13.testCollections(collection);
        Java14.testCollections(collection);
        Java15.testCollections(collection);
        Java16.testCollections(collection);
    }
}
