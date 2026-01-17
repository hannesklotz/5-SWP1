package command.smarthome;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command == null) {
            System.out.println("RemoteControl: Kein Command gesetzt");
            return;
        }
        command.execute();
    }
}
