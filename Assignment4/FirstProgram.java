import java.util.Arrays;
import java.util.Scanner;

public class FirstProgram {

    public static void arrys(int ar1[],int ar2[],int ar3[]) {
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        Arrays.sort(ar3);

        int m = 0;
        int finalarr[]= new int[10];
        
        for(int i=0 ; i<ar1.length;i++){
            for(int j=0 ; j<ar2.length;j++){
               if(ar1[i]==ar2[j])
               for(int k=0 ; k<ar3.length;k++){
                 if(ar2[j]==ar3[k]){
                 finalarr[m]= ar3[k];
                 m++;
                 }
                 else 
                 continue;
               }
               else 
               continue;
        }
    }
    System.out.println("Similar integers in three arrays are:");
       for(int elements: finalarr){
        System.out.println(elements);
       }
    }
    public static void main(String args[]){

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no. of elements in an array1");
    int n1= sc.nextInt();
    int arr1[]= new int[n1+1];
    System.out.println("Enter the elements of an array1");
    for(int i=0 ; i<n1;i++){
       arr1[i]=sc.nextInt();
    }

    System.out.println("Enter the no. of elements in an array2");
    int n2= sc.nextInt();
    int arr2[]= new int[n1+1];
    System.out.println("Enter the elements of an array2");
    for(int i=0 ; i<n2;i++){
       arr2[i]=sc.nextInt();
    }

    System.out.println("Enter the no. of elements in an array3");
    int n3= sc.nextInt();
    int arr3[]= new int[n3+1];
    System.out.println("Enter the elements of an array3");
    for(int i=0 ; i<n3;i++){
       arr3[i]=sc.nextInt();
    }
    arrys(arr1,arr2,arr3);
}
}
