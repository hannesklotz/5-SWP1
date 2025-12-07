package smarthome;

public class SmartHomeTest {

    public static void main(String[] args) {

        TemperatureSensor sensor = new TemperatureSensor();

        TemperatureDisplay display = new TemperatureDisplay();
        Heater heater = new Heater();
        AirConditioner ac = new AirConditioner();

        sensor.attach(display);
        sensor.attach(heater);
        sensor.attach(ac);

        System.out.println("Temperatur wird auf 18°C gesetzt:");
        sensor.setTemperature(18);

        System.out.println("\nTemperatur wird auf 27°C gesetzt:");
        sensor.setTemperature(27);

        System.out.println("\nTemperatur wird auf 22°C gesetzt:");
        sensor.setTemperature(22);
    }
}
