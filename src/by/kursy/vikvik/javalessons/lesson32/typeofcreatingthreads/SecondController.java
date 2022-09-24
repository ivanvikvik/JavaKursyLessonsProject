package by.kursy.vikvik.javalessons.lesson32.typeofcreatingthreads;

public class SecondController {
    public static void main(String[] args) {
        SecondThread thread1 = new SecondThread();
        Thread thread = new Thread(thread1);
        thread.start();

        Thread mainThread = Thread.currentThread();
        String name = mainThread.getName();
        long id = mainThread.getId();
//
//        while(true){
//            try {
//                System.out.printf("msg from %d) %s thread...\n", id, name);
//                Thread.sleep(500);
//            }catch(InterruptedException exception){
//                System.out.println(exception);
//            }
//        }


        for (int i = 0; i < 100; i++) {
            try {
                System.out.printf("msg from %d) %s thread...\n", id, name);
                Thread.sleep(100);
            }catch(InterruptedException exception){
                System.out.println(exception);
            }
        }
    }
}
