public class Timer {
    private ClockHand hundredthsOfSeconds;
    private ClockHand seconds;

    public Timer(){
        this.hundredthsOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance(){
        this.hundredthsOfSeconds.advance();
        if(this.hundredthsOfSeconds.value() == 0){
            this.seconds.advance();
        }
    }

    @Override
    public String toString(){
        return seconds + ":" + hundredthsOfSeconds;
    }
}
