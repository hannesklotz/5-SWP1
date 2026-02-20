package state.ticketautomat;

public class Test {

    public static void main(String[] args) {

        TicketMachine machine = new TicketMachine();

        machine.insertMoney();
        machine.selectTicket();
        machine.dispense();
        machine.insertMoney();
    }
}