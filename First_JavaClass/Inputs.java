import java.util.Scanner;

// import java.util.*;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        System.out.print("please enter your string : ");
        String name = input.nextLine();
        System.out.println(name);

        // float marks = input.nextFloat();
        // System.out.println(marks);
    }
}