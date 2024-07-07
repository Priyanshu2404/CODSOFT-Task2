import java.util.Scanner;                   //Scanner class for getting input from the user.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        gradecalc();                               //Calling out the function
    }

    public static void gradecalc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT GRADING PROGRAM:  ");
        System.out.println("Enter the marks of first subject: ");
        int m1 = sc.nextInt();
        System.out.println("Enter the marks of second subject: ");
        int m2 = sc.nextInt();
        System.out.println("Enter the marks of third subject: ");
        int m3 = sc.nextInt();
        System.out.println("Enter the marks of fourth subject: ");
        int m4 = sc.nextInt();
        System.out.println("Enter the marks of fifth subject: ");
        int m5 = sc.nextInt();
        int totalmarks = m1 + m2 + m3 + m4 + m5;
        float percent = (float) totalmarks /5;
        System.out.println("STUDENTS GRADES ARE LISTED BELOW: ");
        System.out.println("Total marks of the student are " + totalmarks + " out of 500");
        System.out.println("Average percentage is " + percent + " %");
        System.out.println("Your grade is: ");

        if (percent >= 90) {
            System.out.println("A1 grade, KEEP IT UP!!");
        } else if (percent >= 80) {
            System.out.println("A2 grade, NICE!!");
        } else if (percent >= 70) {
            System.out.println("B1 grade, CAN DO BETTER!!");
        } else if (percent >= 60) {
            System.out.println("B2 grade, NEED IMPROVEMENT!!");
        } else if (percent >= 50) {
            System.out.println("C1 grade, POOR MARKS");
        } else if (percent >= 40) {
            System.out.println("D1 grade, ALMOST PASSED");
        } else {
            System.out.println("FAIL!!, E GRADE");
        }
        sc.close();
    }
}
