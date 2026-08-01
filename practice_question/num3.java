//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class num3{
    public static int greater(int a,int b){
        if (a > b){
            return a;
        }else if (a<b){
            return b;
        }else{
            System.out.println("equal to");
        }
        return a;
    }
 public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
     int b = sc.nextInt();
     int result=greater(a,b);
 }
}
