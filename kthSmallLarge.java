/* Let ‘N’ = 4,  ‘Arr’ be [1, 2, 5, 4] and ‘K’ = 3.  
then the elements of this array in ascending order is [1, 2, 4, 5].  Clearly, the 3rd smallest and largest element of this array is 4 and 2 respectively. */

import java.util.ArrayList;
import java.util.Collections;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		Collections.sort(arr); //sort the array list using sort function from collection
		ArrayList<Integer> list=new ArrayList<>();

		int small=arr.get(k-1); //get the smallest kth ele
		int large=arr.get(n-k); //get the highest kth ele

		list.add(small); //add small ele to list
		list.add(large); //add largest ele to list

		return list; //return the final list
	}
}
