// 5 	Write a program that prompts the user to enter three integers and display the integers in decreasing order.  	2
import java.util.*;
public class num6{
    public static void main(String args[]){
        int[] arr = {40,30,20,10};

        Arrays.sort(arr);
        System.out.println("descending order:");
        for (int i =arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }



    }



}

