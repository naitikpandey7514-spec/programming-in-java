import java.sql.SQLOutput;
import java.util.Scanner;

// basic calculator using switch statement

public class prac2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number:");
        int num1 = sc.nextInt();
        System.out.print("enter the number:");
        int num2 = sc.nextInt();
        System.out.print("enter the operators(+,-,*,/):");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
            System.out.println("sum="+(num1 + num2));
            break;

            case '-':
                System.out.println("subtract="+(num1 - num2));
                break;
            case '*':
                System.out.println("multiplication="+(num1 * num2));
                break;
            case '/':
                System.out.println("division="+(num1 / num2));
                break;
            default:
                System.out.println("invalid");
        }

    }
}
