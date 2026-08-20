
//Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant.

     import java.util.*;
public class num8 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
        System.out.println("enter a letter:");
        char l= sc.next().charAt(0);
        if(l == 'a' || l=='e' || l=='i' || l=='o' || l=='u'){
            System.out.println("letter is vowel:"+l);
        }else{
            System.out.println("letter is constant:"+l);
        }

    }
}
