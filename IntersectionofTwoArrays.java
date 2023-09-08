/*Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums=new int[1001]; //constraint given
        int count=0;
        for(int i=0;i<nums1.length;i++){ //for array1
            nums[nums1[i]]=1; //assigning the elements of nums1 as an index of nums and assigning 1 as the initial count
          //nums[4]=1, nums[9]=1, nums[5]=1 and the length of nums is 9 here and other indexes are 0
        }
        for(int i=0;i<nums2.length;i++){ //for array2
            if(nums[nums2[i]]==1){ //checks if nums has the same element by comparing nums1 and nums2 elements
              //nums[9]==1? 
                nums[nums2[i]]=2; //if true, make the value of nums[9]=2
                count++; //increase the count i.e. 1
            }
        }
        int[] temp=new int[count]; //new array for displaying the values in common
        for(int i=0,j=0; i<nums.length && j<count;i++){ //nums is the new array where we stored the final counts
            if(nums[i]==2){ //if the count is more than 1
                temp[j]=i; //store the element i in temp array
                j++; 
            }

        }
        return temp;
    }
}
