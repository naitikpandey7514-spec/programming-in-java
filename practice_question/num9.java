//Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a program to generate a plate number.

import java.util.*;
public class num9 {
public static void main(String args[]){
   Random sc = new Random();
   String plate="";
   for(int i=0;i<3;i++){
       char letter=(char)('A' +sc.nextInt(26));
       plate += letter;
   }
   for(int j=0;j<4;j++){
       plate += sc.nextInt(10);
   }
    System.out.print("vehical plate number is:"+plate);
}

}
