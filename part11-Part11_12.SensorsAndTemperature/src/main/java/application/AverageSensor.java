package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }


    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (s.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor s : sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s : sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (isOn() == false || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        }

        double sum = 0;

        for (Sensor s : sensors) {
            int n = s.read();
            sum += n;
        }

        double avg = sum / this.sensors.size();
        this.readings.add((int)avg);
        return (int)avg;
    }

    public List<Integer> readings() {
        return this.readings;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

}
