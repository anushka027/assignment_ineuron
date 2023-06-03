import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SecondProgram {
    public static List<List<Integer>> list(int ar1[],int ar2[]) {
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : ar1) {
            set1.add(num);
        }

        for (int num : ar2){
            set2.add(num);
        }
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        for (int num : ar1) {
            if (!set2.contains(num)) {
                answer1.add(num);
            }
        }

        for (int num : ar2) {
            if (!set1.contains(num)) {
                answer2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(answer1);
        answer.add(answer2);

        return answer;
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
        List<List<Integer>> result = list(arr1,arr2);

        System.out.println("Distinct integers in nums1 not present in nums2: " + result.get(0));
        System.out.println("Distinct integers in nums2 not present in nums1: " + result.get(1));
    }
}

