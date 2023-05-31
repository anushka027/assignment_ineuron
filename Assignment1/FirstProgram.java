package Assignment1;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String args[]){
    int  n, i,target,j;

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no. of elements in an array");
    n= sc.nextInt();
    int arr[]= new int[n+1];
    System.out.println("Enter the elements of an array");
    for(i=0 ; i<n;i++){
       arr[i]=sc.nextInt();
    }

    System.out.println("Enter the target value");
    target = sc.nextInt();

    for(i=0; i<n; i++){
        for(j=i; j<n; j++)
        if(arr[i]+arr[j]==target)
         System.out.println("value at index "+i+" and "+j+ " adds upto give target "+target);
         else
         continue;
    }
}
}