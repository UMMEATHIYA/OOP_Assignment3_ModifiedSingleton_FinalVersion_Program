package Q1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Lazy Singleton
        System.out.println("Creating three instances of Lazy Singleton...");
        LazySingletonAssignment3.getInstance(1);
        Thread.sleep(2000);
        LazySingletonAssignment3.getInstance(2);
        Thread.sleep(2000);
        LazySingletonAssignment3.getInstance(3);
        System.out.println();

        // Eager Singleton
        System.out.println("Creating three instances of Eager Singleton...");
        EagerSingletonAssignment3.getInstance(1);
        Thread.sleep(2000);
        EagerSingletonAssignment3.getInstance(2);
        Thread.sleep(2000);
        EagerSingletonAssignment3.getInstance(3);
    }

}