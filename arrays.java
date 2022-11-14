/* this the the "arrays.java" file in which all the methods releated to arrays operations like :
    arrayCreation
    arrayInsertion
    arrayDeletion
    arrayMerging
    arraySorting
etc. , are written from the stratch

*/

/*                            Must Read and a very important note                           */

/* i have created a package named "array" in the java file named "arrays.java" in this all the methods releated to array operations are written 
   first of all the user must have to compile the "arrays.java" file by "javac -d . arrays.java" by this the "array" named folder is created */

package array;
import java.util.Scanner;

class arrayMethods{
    public int[] arrayCreate(int range){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the numbers :\t");
        int[] arr=new int[range];
        for(int x=0;x<range;x++){
            arr[x]=sc.nextInt();
        }
        return arr;
    }   

    public void arrayDisplay(int []arr){
        System.out.print("\nData in the array is :\n\n");
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }System.out.print("\n\n");
    }

    public int[] insertAtStart(int a[],int data){
        int[] b=new int[a.length+1];
        b[0]=data;
        int m=0;
        for(int x=1;x<=a.length;x++){
            b[x]=a[m];
            m++;
        }
        return b;
    }

    public int[] insertAtPos(int []a,int data,int pos){
        int[] b=new int[a.length+1];
        int x;
        for(x=0;x<pos-1;x++){
            b[x]=a[x];
        }
        b[x]=data;
        int m=pos;
        for(int y=pos-1;y<a.length;y++){
            b[m]=a[y];
            m++;
        }
        return b;
    }

    public int[] insertAtLast(int a[],int data){
        int[] b=new int[a.length+1];
        int x;
        for(x=0;x<a.length;x++){
            b[x]=a[x];
        }
        b[x]=data;
        return b;
    }

    public int[] deleteAtStart(int a[]){
        int[] b=new int[a.length-1];
        int m=0;
        for(int x=1;x<a.length;x++){
            b[m]=a[x];
            m++;
        }
        return b;
    }

    public int[] deleteAtPos(int a[],int pos){
        int[] b=new int[a.length-1];
        for(int x=0;x<pos-1;x++){
            b[x]=a[x];
        }
        int m=pos-1;
        for(int x=pos;x<a.length;x++){
            b[m]=a[x];
            m++;
        }
        return b;
    }

    public int[] deleteAtLast(int a[]){
        int[] b=new int[a.length-1];
        for(int x=0;x<a.length-1;x++){
            b[x]=a[x];
        }
        return b;
    }

    public void arraySorting(int a[]){
        int x;
        for(int m=0;m<a.length-1;m++){
            for(int n=0;n<a.length-1;n++){
                if(a[n]>a[n+1]){
                    x=a[n];
                    a[n]=a[n+1];
                    a[n+1]=x;
                }
            }
        }
    }

    public int[] arrayMerging(int a[],int b[]){
        int c[]=new int[a.length+b.length];
        for(int x=0;x<a.length;x++){
            c[x]=a[x];
        }
        int m=0;
        for(int x=a.length;x<(a.length+b.length);x++){
            c[x]=b[m];
            m++;
        }
        return c;
    }
}
