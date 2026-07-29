//  multiplication of two number.

import java.util.*;
public class ex2{
    public static int printmultiply(int a , int b){
        int multiply = a * b ;
        return multiply;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = printmultiply(a ,b);
        System.out.println("multiply is "+result);
    }

}
