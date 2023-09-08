import java.util.Scanner;

public class Np_USD {
    public static void main(String[] args) {

        Scanner zz = new Scanner(System.in);

        System.out.println("Enter amount in NRP: ");
        double nrp = zz.nextDouble();

        double usd_rate = 0.0075;

        double nrp_to_usd = nrp*usd_rate;

        System.out.println("The amount in USD from NRP is: "+ nrp_to_usd+"$");
    }
}
