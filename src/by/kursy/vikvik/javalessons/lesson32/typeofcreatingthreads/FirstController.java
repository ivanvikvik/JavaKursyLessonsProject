package by.kursy.vikvik.javalessons.lesson32.typeofcreatingthreads;

public class FirstController {
    public static void main(String[] args) {
        FirstThread thread1 = new FirstThread();
        FirstThread thread2 = new FirstThread();
        FirstThread thread3 = new FirstThread();
        FirstThread thread4 = new FirstThread();

//        thread1.run();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread mainThread = Thread.currentThread();
        String name = mainThread.getName();
        long id = mainThread.getId();

        while(true){
            try {
                System.out.printf("msg from %d) %s thread...\n", id, name);
                Thread.sleep(500);
            }catch(InterruptedException exception){
                System.out.println(exception);
            }
        }
    }
}