package state.ticketautomat;

public interface State {
    void insertMoney(TicketMachine machine);
    void selectTicket(TicketMachine machine);
    void dispense(TicketMachine machine);
}