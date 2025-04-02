
public class Statistics {
    private int count;
    private int sum = 0;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.count++;
        
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if(count!=0) {
            return this.sum*1.0/this.count;
        } else return 0.0;
    }
}
