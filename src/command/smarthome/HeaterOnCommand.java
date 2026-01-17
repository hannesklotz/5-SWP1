package command.smarthome;

public class HeaterOnCommand implements Command {
    private final Heater heater;

    public HeaterOnCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        heater.switchOn();
    }
}
