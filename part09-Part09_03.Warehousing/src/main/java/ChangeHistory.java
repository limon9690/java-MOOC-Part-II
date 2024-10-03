import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory () {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        this.list.clear();
    }

    public String toString() {
        return this.list.toString();
    }

    public double maxValue() {
        if (this.list.isEmpty()) {
            return 0;
        }

        double max = Double.MIN_VALUE;
        for (double d : this.list) {
            max = Math.max(max, d);
        }
        return max;
    }

    public double minValue() {
        if (this.list.isEmpty()) {
            return 0;
        }

        double min = Double.MAX_VALUE;

        for (double d : this.list) {
            min = Math.min(min, d);
        }
        return min;
    }

    public double average() {
        if (this.list.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (double d : this.list) {
            sum += d;
        }

        return sum / this.list.size();
    }
}
