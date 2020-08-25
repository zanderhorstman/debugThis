import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the test score in the field below.");
        int testScore=input.nextInt();
        char grade;


        if (testScore >=90) {
            System.out.println(grade = 'A');
        } else if (testScore >=80) {
            System.out.println(grade = 'B');
        } else if (testScore >=70) {
            System.out.println(grade = 'C');
        } else if (testScore >=60) {
            System.out.println(grade = 'D');
        } else {
            System.out.println(grade = 'F');
        }
    }
}
