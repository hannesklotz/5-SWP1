package state.ticketautomat;

public class TicketMachine {

    private State state;

    public TicketMachine() {
        state = new IdleState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertMoney() {
        state.insertMoney(this);
    }

    public void selectTicket() {
        state.selectTicket(this);
    }

    public void dispense() {
        state.dispense(this);
    }
}