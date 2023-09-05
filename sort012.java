//Dutch National Flag Algorithm
//On leetcode as Sort Colors-medium
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int low=0, mid=0, high=arr.length-1; //assigning positions for 0, 1 and 2
        while(mid<=high){ //checks if mid is less than high
            if(arr[mid]==0){ //if mid index value is 0 means we need to move it to the low position
                int temp=arr[low]; //swapping the value using temp
                arr[low]=arr[mid]; //assigning low index value as zero
                arr[mid]=temp; //in the mid index the temp value is stored temporarily
                mid++; //increment mid to mov to the next position
                low++; //increment low for the same reason
            }
            else if(arr[mid]==1){ //if mid value is 1 then its already in its correct position hence no need to swap
                mid++; //just increment the index for the next element
            }
            else{ //when the value is not 0 and 1 then must be 2
                int temp=arr[mid];  //swap, mid value is 2 then move to the right side
                arr[mid]=arr[high]; //moving the mid value 2 to highest position
                arr[high]=temp; //temporary value to swap elements
                high--; //decrementing high position to check if there is more 2s or not

            }
        }
    }
}
