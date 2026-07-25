import java.util.Scanner;

public class if_else {
    public static void main(String[] args){

        // if else - it  is a conditional statement used forLoop.java decision -making. if block execute if the condition is true otherwise else block executed.

        // eg

        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("can vote");

        }else{
            System.out.println("cant vote");
        }
    }
}