package state.ticketautomat;

public class HasMoneyState implements State {

    @Override
    public void insertMoney(TicketMachine machine) {
        System.out.println("Geld wurde bereits eingeworfen.");
    }

    @Override
    public void selectTicket(TicketMachine machine) {
        System.out.println("Ticket ausgewählt.");
        machine.setState(new DispensingState());
    }

    @Override
    public void dispense(TicketMachine machine) {
        System.out.println("Bitte zuerst Ticket auswählen.");
    }
}