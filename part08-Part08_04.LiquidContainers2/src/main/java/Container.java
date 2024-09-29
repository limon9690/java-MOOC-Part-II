public class Container {
    private int load;

    public Container () {
        this.load = 0;
    }

    public int contains() {
        return this.load;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.load += amount;
        }

        if (this.load > 100) {
            this.load = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.load -= amount;
        }

        if (this.load < 0) {
            this.load = 0;
        }
    }

    public String toString() {
        return "" + this.load + "/100";
    }
    
}
