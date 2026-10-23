package stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;

    /**
     * Khởi tạo startTime = thời gian hiện tại của hệ thống
     */
    public StopWatch() {
    }

    /**
     * Reset startTime về thời gian hiện tại
     */
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    /**
     * Thiết đặt endTime về thời gian hiện tại
     */
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    /**
     * Thời gian đã trôi qua (mili giây)
     */
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}