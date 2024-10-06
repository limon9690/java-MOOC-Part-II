import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> list;

    public Herd () {
        this.list = new ArrayList<>();
    }

    public String toString() {
        String result = "";

        for (Movable mv : list) {
            result += "\n" + mv.toString();
        }

        return result;
    }


    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }


    @Override
    public void move(int dx, int dy) {
        for (Movable mv : list) {
            mv.move(dx, dy);
        }
    }
    
}
