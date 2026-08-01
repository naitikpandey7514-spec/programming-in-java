// Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class num1{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int total = n1 + n2 + n3 ;
        int avg = total/3;
        System.out.println("average of three number is:"+avg);
    }
}
