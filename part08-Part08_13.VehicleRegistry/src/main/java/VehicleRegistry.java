import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> map;

    public VehicleRegistry () {
        this.map = new HashMap<>();
    }

    public void printLicensePlates() {
        for (LicensePlate li : map.keySet()) {
            System.out.println(li);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : map.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }

    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!map.containsKey(licensePlate)) {
            map.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.map.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!map.containsKey(licensePlate)) {
            return false;
        }

        map.remove(licensePlate);
        return true;
    }
}
