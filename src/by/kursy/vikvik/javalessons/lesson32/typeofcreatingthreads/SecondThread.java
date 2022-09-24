package by.kursy.vikvik.javalessons.lesson32.typeofcreatingthreads;

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

        for (int i = 0; i < 200; i++) {
            try {
                System.out.printf("msg from %d) %s thread...\n", id, name);
                Thread.sleep(100);
            }catch(InterruptedException exception){
                System.out.println(exception);
            }
        }
    }
}
