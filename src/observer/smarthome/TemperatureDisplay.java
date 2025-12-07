package smarthome;

public class TemperatureDisplay implements TemperatureObserver {

    @Override
    public void update(int newTemperature) {
        System.out.println("Display: aktuelle Temperatur = " + newTemperature + "°C");
    }
}
