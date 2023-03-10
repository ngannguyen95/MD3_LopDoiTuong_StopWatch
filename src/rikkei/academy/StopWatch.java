package rikkei.academy;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.nanoTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.nanoTime();
    }

    public void end() {
        this.endTime = System.nanoTime();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

//    @Override
//    public String toString() {
//        return "StopWatch{" +
//                "startTime=" + startTime +
//                ", endTime=" + endTime +
//                '}';
//    }
}
