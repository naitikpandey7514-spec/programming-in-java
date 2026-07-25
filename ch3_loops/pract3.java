//pattern 3
/*
12345
1234
123
12
1
 */
public class pract3 {
    public static void main(String[] args){
        int i = 1;
        for(i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
