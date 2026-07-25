import java.util.Scanner;

// else if - it is used to check multiple 'conditions' and executed when the condition is true.

// example take a two input from the user and check the number is greater or mot

public class else_if {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1==num2){
            System.out.println("number is equal");
        }else if(num1 > num2){
            System.out.println("num1 is greater");
        }else{
            System.out.println("num3 is greater");
        }

    }
}
