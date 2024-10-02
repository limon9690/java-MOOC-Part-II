import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> directory;

    public StorageFacility () {
        this.directory = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.directory.putIfAbsent(unit, new ArrayList<>());
        this.directory.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!this.directory.containsKey(storageUnit)) {
            return new ArrayList<>();
        }

        return this.directory.get(storageUnit);
    }
}
