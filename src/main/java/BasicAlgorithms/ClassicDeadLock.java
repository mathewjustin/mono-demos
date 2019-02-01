package BasicAlgorithms;

public class ClassicDeadLock {

    static {
        try {
        Thread lock=new Thread(new Runnable() {
            @Override
            public void run() {
                ClassicDeadLock.staticinitializer();
            }
        });
        lock.start();
        lock.join();
        } catch (InterruptedException e) {
            System.out.println("You wont see me.");
        }


    }

    public static void main(String[] args) {
        System.out.println("Initialising..");
    }
    static  void staticinitializer()
    {
        System.err.println("init..");
    }
}
