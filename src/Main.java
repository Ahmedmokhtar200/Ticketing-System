import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            Scanner scanner1 = new Scanner(file);
            StringBuilder ticketsOptions = new StringBuilder();
            while (scanner1.hasNextLine()) {
                ticketsOptions.append(scanner1.nextLine()).append("\n");
            }
                System.out.println(ticketsOptions);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
