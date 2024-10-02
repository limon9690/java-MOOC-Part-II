import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> directory;

    public StorageFacility () {
        this.directory = new HashMap<>();
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> result = new ArrayList<>();
        
        for (String key : this.directory.keySet()) {
            result.add(key);
        }
        
        return result;
    }

    public void remove(String storageUnit, String item) {
        if (!this.directory.containsKey(storageUnit)) {
            return;
        }

        ArrayList<String> list = this.directory.get(storageUnit);

        for (String s : list) {
            if (s.equals(item)) {
                list.remove(s);
                break;
            }
        }

        if (this.directory.get(storageUnit).isEmpty()) {
            this.directory.remove(storageUnit);
        }
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
