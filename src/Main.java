import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        List<String> ticketCategories;
        String[] ticketTypes;
        try{
            TicketHandler ticketHandler = new TicketHandler(new File(args[0]));
            ticketCategories = ticketHandler.getTicketCategories();
            ticketTypes = ticketHandler.getTicketTypes();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String type = "";
        String category = "";
        String description = "";
        while(true) {
            System.out.println("Choose Interface"+"\n"+"1.Employee ui"+"\n"+"2.IT Support");


            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter Employee Name:");
                    String name = input.nextLine();
                    Employee emp = new Employee(name);
                    boolean flag = false;
                    do{
                        System.out.println("Enter Category of The Ticket");
                        System.out.println(ticketCategories.toString());
                        category = input.nextLine();

                        for (String ticketCategory : ticketCategories) {
                            if (ticketCategory.equals(category)) {
                                flag = true;
                                break;
                            }
                        }
                        if (!flag) {
                            System.out.println("Please Enter valid Category !!");
                            continue;
                        }

                        flag = false;
                        System.out.println("Enter Type of Ticket");
                        System.out.println(Arrays.toString(ticketTypes));
                        type = input.nextLine();
                        for( String ticketType : ticketTypes) {
                            if (ticketType.equals(type)) {
                                flag = true;
                                break;
                            }
                        }
                        if (!flag) {
                            System.out.println("Please Enter valid Type !!");
                            continue;
                        }
                        System.out.println("Enter Description of Ticket");
                        description = input.nextLine();
                    }while (!flag);

                    System.out.println("After while loop ");
                    System.out.println("category is "+category);
                    System.out.println("type is "+type);
                    System.out.println("description is "+description);
                    emp.sendTicket(category,type,description);
                    break;
                case 2:
                    System.out.println("Welcome IT Support member"+"\n"+"Here all Tickets");
                    System.out.println(new IT().readTickets());
            }
        }

    }
}
