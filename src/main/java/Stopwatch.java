public class Stopwatch {

    protected boolean isRunning;


    protected long timeOfStart;


    protected long passedTime;

    public Stopwatch() {
        reset();
    }

    protected void reset() {
        isRunning = false;
        timeOfStart = passedTime = 0;
    }

    public void start() {
        if (isRunning) {
            return;
        }

        isRunning = true;
        timeOfStart = System.currentTimeMillis();
    }

    public void stop() {
        if (!isRunning) {
            return;
        }

        isRunning = false;
        long timeOfStop = System.currentTimeMillis();
        passedTime = passedTime + (timeOfStop - timeOfStart);
    }
}
