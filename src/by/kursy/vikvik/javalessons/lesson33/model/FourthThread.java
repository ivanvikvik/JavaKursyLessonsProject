package by.kursy.vikvik.javalessons.lesson33.model;

// 90%
public class FourthThread implements Runnable {
    private Thread thread;
    private boolean running;

    public FourthThread() {
        thread = new Thread(this);
        running = true;
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public void stop(){
        running = false;
    }

    @Override
    public void run() {
        String name = thread.getName();

//        for (int i = 0; i < 100; i++) {
//
//            System.out.printf("Child thread %s is running...\n", name);
//        }

        while (running) {
            System.out.printf("Child thread %s is running...\n", name);

//            try {
//                //Thread.sleep(1000);
//                TimeUnit.MILLISECONDS.sleep(100);
//            } catch (InterruptedException exception) {
//                System.out.println(exception);
//            }
        }

        System.out.printf("Child thread %s finished.", name);
    }
}
