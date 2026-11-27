class NumberTask extends Thread {
    private final int start;
    NumberTask(int start) { this.start = start; }
    public void run() {
        for (int i = start; i < start + 5; i++) System.out.println(getName() + ": " + i);
    }
}
public class MultithreadingTasks {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new NumberTask(1), t2 = new NumberTask(6);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Both tasks completed");
    }
}
