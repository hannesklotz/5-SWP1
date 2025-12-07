package smarthome;

public class AirConditioner implements TemperatureObserver {

    private boolean on = false;

    @Override
    public void update(int newTemperature) {
        if (newTemperature > 26 && !on) {
            on = true;
            System.out.println("Klimaanlage: eingeschaltet (Temperatur = " + newTemperature + "°C)");
        } else if (newTemperature <= 26 && on) {
            on = false;
            System.out.println("Klimaanlage: ausgeschaltet (Temperatur = " + newTemperature + "°C)");
        }
    }
}
