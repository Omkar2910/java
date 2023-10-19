package advancejava.multithreading;

class Test implements Runnable{
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("Inside Test Thread");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new Test());
        t.start();
        try {
            for(int i=0; i<50; i++){
            System.out.println("Inside Main Thread");
            Thread.sleep(1);
        }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
