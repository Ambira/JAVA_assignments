import java.util.Random;
import java.util.Scanner;

public class Lucky_gen {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter participant names (with comma): ");
            String parti = scanner.nextLine();

            String[] part = parti.split(",");
            for (int i = 0; i < part.length; i++) {
                part[i] = part[i].trim();
            }

            if (part.length == 0) {
                System.out.println("No participants entered.");
            } else {
                Random rand = new Random();
                int win = rand.nextInt(part.length);

                System.out.println("Lucky Draw Winner: " + part[win]);
            }
        }


}