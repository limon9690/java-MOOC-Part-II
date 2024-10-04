import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> list;
    private double capacity;

    public Box(double capacity) {
        this.list = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add (Packable packable) {
        if (this.weight() + packable.weight() <= capacity) {
            this.list.add(packable);
        }
    }

    @Override
    public double weight() {
        double total = 0;
        for (Packable p : this.list) {
            total += p.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + this.weight() + " kg";
    }

    
    
}
