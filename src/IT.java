import java.util.ArrayList;
import java.util.List;

public class IT {

    public String readTickets() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < TicketHandler.ticketsList.size(); i++) {
            str.append(i+1).append(".").append(TicketHandler.ticketsList.get(i).toString()).append("\n");
        }
        return str.toString();
    }

}
