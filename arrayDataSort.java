/* this is the "arraySort.java" file in which the sorting operation has written */




package array;
import java.util.Scanner;
public class arraySort{
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

