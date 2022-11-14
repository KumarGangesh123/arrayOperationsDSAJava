

/* this is the "arrayDataDelete.java" file in which the operations releated to array deletion like , :
    deleteAtStart
    deleteAtPosiotion
    deleteAtLast
like methods are written from stratch 
*/

/* first of all you have complier the "arrays.java" file to create a package "array" then after 
    compile ->  javac -d . arrayDataDelete.java
    run ->  java array.arrayDataDelete
    
*/


package array;
import java.util.Scanner;
public class arrayDataDelete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        arrayMethods arm=new arrayMethods();
        System.out.print("Enter the range :\t");
        int range=sc.nextInt();
        int[] a=arm.arrayCreate(range);
        arm.arrayDisplay(a);
        System.out.print("\nEnter the position to delete the data :\t");
        int pos=sc.nextInt();
        if(pos == 1){
            a=arm.deleteAtStart(a);
            arm.arrayDisplay(a);
        }else if(pos>1 && pos<a.length){
            a=arm.deleteAtPos(a,pos);
            arm.arrayDisplay(a);
        }else{
            a=arm.deleteAtLast(a);
            arm.arrayDisplay(a);
        }
    }
}
