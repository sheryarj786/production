import java.util.*;

public class ProducerMachine extends TimerTask{
    int treat = 0;
    boolean started = false;



    public void start() {
        started = true;
        System.out.println("Status changed to started...");
        System.out.println("The starting number of treats is: " + treat);
        System.out.println("Every 3 seconds a new treat will be added");
        Timer timer = new Timer();
        timer.schedule(new ProducerMachine(), 0, 3000);

    }

    @Override
    public void run() {
        treat ++;
        System.out.println("There is now " + treat + " treats");

    }

    public static void main(String[] args) {
        ProducerMachine producerMachine = new ProducerMachine();
        producerMachine.start();
    }
}
