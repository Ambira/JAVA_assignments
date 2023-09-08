
import java.util.Scanner;

public class Billing_System {
    public static void main(String[] args) {
        int Milkshake=170,Pasta=270,Momo=200,Pizza=500,total=0,item=0,order=0,items,total_items;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Items would you like? ");

        items= sc.nextInt();
        total_items=items;
        while (items!=0) {
            System.out.println("What is your Order? ");
            System.out.println("1. Milkshake");
            System.out.println("2. Pasta");
            System.out.println("3. Momo");
            System.out.println("4. Pizza");
            System.out.println("Item Number: ");
            item= sc.nextInt();



            if (item==1){
                order=Milkshake;
            }
            else if (item==2){
                order=Pasta;
            }
            else if (item==3){
                order=Momo;
            }
            else if (item==4){
                order=Pizza;
            }
            else{
                System.out.println("Item Not Found !");
                break;
            }
            System.out.println("Enter Quantity: ");
            int qty= sc.nextInt();
            total=total+(order*qty);
            items=items-1;
        }
        System.out.println("Bill");
        System.out.println("No of Items:"+total_items);
        System.out.println("Total Price:"+total);

    }
}
