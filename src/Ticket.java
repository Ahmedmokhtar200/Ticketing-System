import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket {
    private TicketHandler ticketHandler;
    private String senderName;
    private String type;
    private String category;
    private String description;

    public Ticket() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getDescription() {
        return description;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "senderName='" + senderName + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
