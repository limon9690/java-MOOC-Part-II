import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> list;

    public Hideout(){
        this.list = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (list.size() == 1) {
            list.clear();
        }

        list.add(toHide);
    }

    public T takeFromHideout() {
        if (this.list.size() == 0) {
            return null;
        }

        T temp = this.list.get(0);
        this.list.remove(temp);
        return temp;
    }

    public boolean isInHideout() {
        return this.list.size() == 1;
    }

}
