public class Employee {
    private String name;
    private Ticket ticket;

    public Employee() {
    }
    public Employee(String name) {
        this.name = name;
    }

    public void sendTicket(String category, String type, String description) {
        ticket = new Ticket();
        this.ticket.setType(type);
        this.ticket.setCategory(category);
        this.ticket.setSenderName(name);
        this.ticket.setDescription(description);
        TicketHandler.ticketsList.add(ticket);
    }
}
