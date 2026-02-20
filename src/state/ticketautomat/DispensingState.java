package state.ticketautomat;

public class DispensingState implements State {

    @Override
    public void insertMoney(TicketMachine machine) {
        System.out.println("Bitte warten, Ticket wird ausgegeben.");
    }

    @Override
    public void selectTicket(TicketMachine machine) {
        System.out.println("Ticket wird bereits verarbeitet.");
    }

    @Override
    public void dispense(TicketMachine machine) {
        System.out.println("Ticket wird ausgegeben.");
        machine.setState(new IdleState());
    }
}