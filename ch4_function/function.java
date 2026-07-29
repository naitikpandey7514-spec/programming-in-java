// function - a function is a block of code used to perform specific task. it  is called whenever need and it reduced repeatation and make code reusable.

/*
returnType methodName(parameters) {
    // method body
    return value;   // Optional if returnType is void
}
* */




import java.util.*;
public class function{
    public static void printHello(String name){
        System.out.println(name);
        return;
    }
public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String name = sc.next();

        printHello(name);
    }
}
