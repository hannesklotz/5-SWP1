package command.smarthome;

public class SmartHomeCommandTest {

    public static void main(String[] args) {
        Light light = new Light();
        Heater heater = new Heater();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command heaterOn = new HeaterOnCommand(heater);
        Command heaterOff = new HeaterOffCommand(heater);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(heaterOn);
        remote.pressButton();

        remote.setCommand(heaterOff);
        remote.pressButton();
    }
}
