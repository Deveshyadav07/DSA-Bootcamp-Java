import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String fruit = sc.next();

        // if(fruit.equals( "mango")){
        // System.out.println("king of fruits");
        // }
        // if(fruit.equals( "apple")){
        // System.out.println("king of fruits");
        // }
        // if(fruit.equals( "banana")){
        // System.out.println("this is also fruits");
        // }

        // switch (fruit) {
        // case "mango":
        // System.out.println("king of fruits");

        // break;
        // case "banana":
        // System.out.println("this is also fruits");

        // break;
        // case "apple":
        // System.out.println("red sweet fruits");

        // break;
        // default:
        // System.out.println("please enter valid fruite name:");

        // }

        // switch (fruit) {
        // case "mango" -> System.out.println("king of fruits");
        // case "banana" -> System.out.println("this is also fruits");
        // case "apple" -> System.out.println("red sweet fruits");
        // default -> System.out.println("please enter valid fruite name:");

        // }

        int day = sc.nextInt();
        // switch (day) {
        // case 1:
        // System.out.println("monday");

        // break;
        // case 2:
        // System.out.println("tuesday");
        // break;

        // default:
        // break;
        // }
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("enter valid day");

        }

    }
}