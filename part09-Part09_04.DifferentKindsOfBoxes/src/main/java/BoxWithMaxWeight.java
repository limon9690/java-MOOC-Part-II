import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    //private int load;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        //this.load = 0;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int load = 0;

        for (Item it : this.items) {
            load += it.getWeight();
        }

        if (load + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    
}
