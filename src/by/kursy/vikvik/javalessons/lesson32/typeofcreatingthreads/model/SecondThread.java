package by.kursy.vikvik.javalessons.lesson32.typeofcreatingthreads.model;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();

//        while(true){
//            try {
//                System.out.printf("msg from %d) %s thread...\n", id, name);
//                Thread.sleep(500);
//            }catch(InterruptedException exception){
//                System.out.println(exception);
//            }
//        }

        for (int i = 0; i < 50; i++) {
            try {
                System.out.printf("msg from %d) %s thread...\n", id, name);
                Thread.sleep(100);
            }catch(InterruptedException exception){
                System.out.println(exception);
            }
        }

        System.out.printf("Child thread %s finished.\n", name);
    }
}
