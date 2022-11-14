/* this is the "arrayDataMerge.java" file in which the merge operation has written */


package array;
import java.util.Scanner;
public class arrayDataMerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range for the first array:\t");
        int range=sc.nextInt();
        arrayMethods arm=new arrayMethods();
        int[] a=arm.arrayCreate(range);
        arm.arrayDisplay(a);
        System.out.print("\nEnter the range for the second array:\t");
        int range2=sc.nextInt();
        int[] b=arm.arrayCreate(range2);
        
        arm.arrayDisplay(b);
        int[] c=arm.arrayMerging(a, b);
        arm.arrayDisplay(c);
    }
}
