import java.util.Scanner;

// switch statement - the switch statement is used to execute one block of code from multiple choices based on the value of a variable or expression

// eg

public class switch_statement {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     switch(number){
         case 1:
             System.out.println("hello");
             break;
         case 2:
             System.out.println("namaste");
             break;
         default:
             System.out.println("how are you");


     }
  }
}
