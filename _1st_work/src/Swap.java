public class Swap {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1= 7;
        num2= 16;
        System.out.println("Before swapping:");
        System.out.println(num1);
        System.out.println(num2);
        num3= num1;
        num1= num2;
        num2= num3;
        System.out.println("After swapping:");
        System.out.println(num1);
        System.out.println(num2);
    }
}
