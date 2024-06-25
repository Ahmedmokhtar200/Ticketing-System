import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketHandler {
    public static List<Ticket> ticketsList = new ArrayList<>();
    private List<String> ticketCategories =  new ArrayList<String>();
    private String [] ticketTypes = {"Problem" , "Request","Question"};

    public List<String> getTicketCategories() {
        return ticketCategories;
    }

    public String[] getTicketTypes() {
        return ticketTypes;
    }

    public TicketHandler() {
    }

    public TicketHandler(File file) throws FileNotFoundException {
        setCategories(file);
    }

    public void setCategories(File file) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(file);
        while (scanner1.hasNextLine()) {
            ticketCategories.add(scanner1.nextLine());
        }
    }

    public List<String> getCategories() {
        return ticketCategories;
    }

    public void setTypes() {}
}
