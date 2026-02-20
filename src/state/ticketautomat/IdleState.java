package state.ticketautomat;

public class IdleState implements State {

    @Override
    public void insertMoney(TicketMachine machine) {
        System.out.println("Geld eingeworfen.");
        machine.setState(new HasMoneyState());
    }

    @Override
    public void selectTicket(TicketMachine machine) {
        System.out.println("Bitte zuerst Geld einwerfen.");
    }

    @Override
    public void dispense(TicketMachine machine) {
        System.out.println("Kein Ticket verfügbar.");
    }
}