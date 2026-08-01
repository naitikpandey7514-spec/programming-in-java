

//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;

public class num2 {

    public static int oddnum(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = oddnum(num);

        System.out.println("Sum of odd numbers: " + result);
    }
}