package project_01;

public class TimingNode {

    private int n;
    private long time;

    public TimingNode(int n, long time) {
        this.n = n;
        this.time = time;
    }

    public int getN() {
        return n;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Num Items: " + n +
                ", time=" + time;
    }
    
}
