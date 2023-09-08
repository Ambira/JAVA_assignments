
public class Gravity_no_in {
    public static void main(String[] args) {
        double gravitational_constant = 6.67430e-11;
        double mass_earth = 5.972e24;
        double radius_earth = 6.371e6;
        double gravity_earth = (gravitational_constant * mass_earth) / (radius_earth * radius_earth);

        System.out.println("The gravity of Earth is : " + gravity_earth + " m/s²");
    }
}
