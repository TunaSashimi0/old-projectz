/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.object;

/**
 *
 * @author Alex_
 */
public class ThreadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        Runnable flood , ignition, liftoff;
        flood = new LaunchEvent (16,"Flood the pad!");
        ignition = new LaunchEvent (6,"start engines!");
        liftoff = new LaunchEvent (0 , "Liftoff!");
        clock.start();
        new Thread (flood).start();
        new Thread (ignition).start();
        new Thread (liftoff ).start();
    }
    
}
    class CountDownClock extends Thread{
        public void run (){
            for (int t = 20; t >= 0; t--) {
                System.out.println("T minus "+t);
                try{
                    Thread.sleep(1000);
                    
                }
                catch (InterruptedException e){}
            }
        }
    }
class LaunchEvent implements Runnable {
    private int start;
    private String message;
    public LaunchEvent (int start, String message){
        this.start = start;
        this.message = message;
    }
    public void run(){
        try {
            Thread.sleep(2000-(start*1000));
            
        }
        catch (Exception e){}
        System.out.println(message);
    }
}
    

