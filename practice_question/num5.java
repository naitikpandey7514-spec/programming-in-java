// convert meter to feet
import java.util.*;
public class num5 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the distance in meter:");
        long meter = sc.nextLong();
        double feet = meter * 3.28;
        System.out.print("conversion of meter to feet is :"+feet);

        sc.close();

    }
}
