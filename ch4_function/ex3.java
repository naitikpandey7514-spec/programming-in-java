//  factorial of the user number.


import java.util.*;
public class ex3 {
    public static void fact(int num) {
        int factorial = 1;
        for (int i = num; i>=1; i--) {
            factorial = factorial *i;
        }
        System.out.println( "factorial of " +num +":" +factorial);
        return;
    }
        public static void main (String args []){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            fact(num);
        }
    }
