package smarthome;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {

    private int temperature;
    private List<TemperatureObserver> observers = new ArrayList<>();

    public void attach(TemperatureObserver obs) {
        observers.add(obs);
    }

    public void detach(TemperatureObserver obs) {
        observers.remove(obs);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    private void notifyObservers() {
        for (TemperatureObserver obs : observers) {
            obs.update(temperature);
        }
    }
}
