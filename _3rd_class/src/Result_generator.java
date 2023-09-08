import java.util.Scanner;

public class Result_generator {
    public static void main(String[] args) {
        System.out.println("Enter marks ");
        Scanner obj1= new Scanner(System.in);
        double sub1= obj1.nextInt();

        System.out.println("Enter 2nd marks ");
        Scanner obj2= new Scanner(System.in);
        double sub2= obj2.nextInt();

        System.out.println("Enter 3rd marks");
        Scanner obj3= new Scanner(System.in);
        double sub3= obj3.nextInt();


        double percentage = ((sub1+sub2+sub3)/300)*100;
        System.out.println(percentage);
        if(percentage>=90){
            System.out.println("Grade= Distinction");
        }
        else if(percentage<90 & percentage>=80){
            System.out.println("Grade= First division");
        }
        else if(percentage<80 & percentage>=70) {
            System.out.println("Grade= Second Division");
        } else if (percentage<70 & percentage>=60) {
            System.out.println("Grade = Third Division");
        } else{
            System.out.println("Grade= Fail");
        }
    }
}