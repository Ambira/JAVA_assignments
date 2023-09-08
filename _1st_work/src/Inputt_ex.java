import java.util.Scanner;

public class Inputt_ex {
    public static void main(String[] args) {
        String name ;
        //creating object of scanner
        Scanner scc = new Scanner(System.in);

        //displaying message for input
        System.out.println("Enter your name : ");

        //taking value from input and storing in variable
        name = scc.next();
        System.out.println("Name is "+ name);
    }
}
