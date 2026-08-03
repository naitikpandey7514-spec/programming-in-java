// simple calculator
import java.sql.SQLOutput;
import java.util.*;
class num4{
    public static void main(String args[]){
Scanner sc = new Scanner (System.in);
        System.out.print("enter first num:");
        int num1 = sc.nextInt();
        System.out.print("enter second num:");
        int num2 = sc.nextInt();

        sc.nextLine();
        System.out.print("enter your choice(+,-,*,/,**,%): ");
        String choice = sc.nextLine();

        switch(choice){
            case "+":
                System.out.println("sum:"+(num1 + num2));
                break;
            case "-":
                System.out.println("substraction:"+(num1-num2));
                break;
            case "*":
                System.out.println("multiplication:"+(num1 * num2));
                break;
            case "/":
                System.out.println("division:"+(num1 / num2));
                break;

            case "**":
                System.out.println("square:"+Math.pow(num1,num2));
                break;
            case "%":
                System.out.println("module:"+(num1%num2));
                break;



        }

        sc.close();
    }


}