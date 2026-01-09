package observer.smarthome;

public class Heater implements TemperatureObserver {

    private boolean on = false;

    @Override
    public void update(int newTemperature) {
        if (newTemperature < 20 && !on) {
            on = true;
            System.out.println("Heizung: eingeschaltet (Temperatur = " + newTemperature + "°C)");
        } else if (newTemperature >= 20 && on) {
            on = false;
            System.out.println("Heizung: ausgeschaltet (Temperatur = " + newTemperature + "°C)");
        }
    }
}
