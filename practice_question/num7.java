import java.util.*;
class num7{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && b>=c){
            System.out.println("descending order:"+a+" "+b+ " "+c);
        }
        else if(a>=c && c>=b){
            System.out.println("descending order:"+a+" "+c+ " "+b);
        }
        else if(b>=a && a>=c){
            System.out.println("descending order:"+b+" "+a+ " "+c);
        }
        else if(b>=c && c>=a){
            System.out.println("descending order:"+b+" "+c+ " "+a);
        }
        else{
            System.out.println("descending order:"+c+" "+b+ " "+a);
        }

    }
}