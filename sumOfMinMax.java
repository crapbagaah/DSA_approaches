import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE; //stores the minimum and maximum possible values in java, better than min=max=0
      for(int i=0; i<n;i++){
        if(arr[i]>max){ //checks if the current value is greater than max
          max=arr[i]; //if true, then assign that value to max
        }
      }

      for(int j=0; j<n;j++){
        if(arr[j]<min){ //checks if the current value is smaller than min
          min=arr[j]; //if true, assign that value to min
        }
      }

      return max+min; //sum of min and max of the array is returned
  }
}
