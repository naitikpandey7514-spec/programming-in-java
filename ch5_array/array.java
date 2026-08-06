// array - An array is a collection of elements of the same data type stored in contiguous memory locations. Each element is accessed using an index, starting from 0.


/*

syntax


declaration:

datatype[] arrName;

creation:

datatype[] arrName = new datatype[size];

initialization:
datatype[] arrName = value;
declare,create,initialise
dataType[] arrayName = {value1, value2, value3, ...};

 */


//eg

public class array {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}