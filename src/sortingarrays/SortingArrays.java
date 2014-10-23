
package sortingarrays;
import java.util.Arrays;
public class SortingArrays {
    
    public static void main(String args[]){
        int arr[] = {4,3,9,7};
        sortArray(arr);
    }
   
    public static void sortArray(int arr[]) {
	 //Unsorted array
	 System.out.print("Unsorted Array:");
	 for(int i =0;i<arr.length;i++){
		 if(i!=0){
			 System.out.print(",");
		 }
		 System.out.print(arr[i]);
	 }
	 //Sorted array in ascending order
	 Arrays.sort(arr);
	 System.out.println();
	 System.out.print("Sorted Array:");
	 for(int i=0;i<arr.length;i++){
		 if(i!=0){
			 System.out.print(",");
			 }
	  System.out.print(arr[i]);
	 } 
    }
    
}
