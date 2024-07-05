import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int num = in.nextInt();
        while (num > 0) {
            int rem = num % 10;
            if (rem == 2) {
                count++;
            }
            num = num / 10; // num /=10;
        }
        System.out.println(count);
    }
}
