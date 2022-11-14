/* this is the "arrayInsert.java" file in which the operations releated to array insertion like , :
    insertAtStart
    insertAtPosiotion
    insertAtLast
like methods are written from stratch 
*/

/* first of all you have complier the "arrays.java" file to create a package "array" then after 
    compile ->  javac -d . arrayDataInsert.java
    run ->  java array.arrayDataInsert
    
*/

package array;
import java.util.Scanner;

public class arrayDataInsert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range :\t");
        int range=sc.nextInt();
        int[] arr=new arrayMethods().arrayCreate(range);
        new arrayMethods().arrayDisplay(arr);
        System.out.print("\nEnter the position to insert the new data :\t");
        int pos=sc.nextInt();
        System.out.print("\nEnter the data to insert :\t");
        int data=sc.nextInt();
        if(pos == 1){
            arr=new arrayMethods().insertAtStart(arr,data);
            new arrayMethods().arrayDisplay(arr);
        }else if(pos>1 && pos<arr.length){
            arr=new arrayMethods().insertAtPos(arr, data, pos);
            new arrayMethods().arrayDisplay(arr);
        }else{
            arr=new arrayMethods().insertAtLast(arr,data);
            new arrayMethods().arrayDisplay(arr);
        }
    }
}
