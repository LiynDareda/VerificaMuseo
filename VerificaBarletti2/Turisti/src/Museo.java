import javax.swing.UIDefaults.ProxyLazyValue;

public class Museo extends Thread{
    private final int max = 3;
    private int ticket = 0;


    public Museo() {
    }

    public synchronized void enter(){
        while(ticket > max){
            System.out.println(Thread.currentThread().getName() + " ASPETTA");
            try{
                wait();
            }catch(InterruptedException e){    }
        }
        ticket++;
    }

    public void attesa(){
        System.out.println(Thread.currentThread().getName() + " è entrato nel museo");
        try{
            sleep((int)((Math.random()*9 + 1)*1000));
        }catch(InterruptedException e){    }
        System.out.println(Thread.currentThread().getName() + " è uscito dal museo");
        uscita();
    }

    public synchronized void uscita(){
        ticket--;
        notify();
    }

}
