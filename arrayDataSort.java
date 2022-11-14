/* this is the "arrayDataSort.java" file in which the sorting operation has written */

/* first of all you have complier the "arrays.java" file to create a package "array" then after 
    compile ->  javac -d . arrayDataSort.java
    run ->  java array.arrayDataInsert
    
*/


package array;
import java.util.Scanner;
public class arrayDataSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range :\t");
        int range=sc.nextInt();
        arrayMethods arm=new arrayMethods();
        int a[]=arm.arrayCreate(range);
        arm.arrayDisplay(a);
        arm.arraySorting(a);
        arm.arrayDisplay(a);
    }
}

