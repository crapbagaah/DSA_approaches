//reverse an array after the position m
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
      //till m, the array should be the same as original so no need to change anything till m
        int start=m+1; // from m+1 position the array is reversed
        int end=arr.size()-1; //end position
        while(start<end){ //loop for start<end
            int temp=arr.get(start); //storing the start value in temp
            arr.set(start,arr.get(end)); //in index start, the end value is stored
            arr.set(end,temp); //in the end index, the start value is stored
            start++; //start is incremented for the loop to iterate till it meets the condition
            end--; //end is decremented till it meets the while loop condition
          //here, the values are getting swapped till end value reaches less than start value
        }
       
    }
}
