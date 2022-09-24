package by.kursy.vikvik.javalessons.lesson32.typeofcreatingthreads;

public class FirstThread extends Thread {
    @Override
    public void run() {
        String name = getName();
        long id = getId();

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
