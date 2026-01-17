package command.smarthome;

public class HeaterOffCommand implements Command {
    private final Heater heater;

    public HeaterOffCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        heater.switchOff();
    }
}
