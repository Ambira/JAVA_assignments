import java.util.Scanner;

public class Weekday_weekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int day = sc.nextInt();

        switch (day){
            case 1:
            case 6:
            case 7:
                System.out.println("Weekend");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
            break;
            default:
                System.out.println("Invalid");
        }

    }
}
