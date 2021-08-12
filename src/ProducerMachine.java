public class ProducerMachine {
    int treats = 0;
    boolean started = false;
    boolean paused = false;

    public void start() {
        started = true;
    }

    public void stop(){
        started = false;
    }
    public void pause(){
        paused = true;
    }


}
