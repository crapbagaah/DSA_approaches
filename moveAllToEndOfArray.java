/*need-to-rearrange-the-array-elements-such-that-all-negative-numbers-appear-before-all-positive-numbers*/
public class Solution {
    public static int[] separateNegativeAndPositive(int a[]) {
        int low=0, high=a.length-1; //assigning lowest and highest index
            while(low<=high){ //loop exists for this condition 0<n-1
                if(a[low]<=0){ //checks if element is less than 0
                    low++; // if yes, its already before the +ve elements so checks for the next element
                }
                else if(a[high]>=0){ //checks if element is higher than 0
                    high--; //if yes, its already at the end of the array so checks for element before itself
                }
                else if(a[low]>=0 && a[high]<0){ //if ele[0]>=0 and ele[n-1]<0
                    int temp=a[low]; //swap positions using temporary value
                    a[low]=a[high]; //assigning that greater value to the end of array
                    a[high]=temp; //moves the lesser value to temp for further checks
                    low++; //index lowest increase for next ele
                    high--; //index highest decrease for prior ele
                }
            }
            return a; //print the final array
        }
        
}

//==========================================================================================================

/*place all negative element at the end of array without changing the order of positive element and negative element*/

class Solution {
    public void segregateElements(int arr[], int n)
    {
        int[] temp=new int[n]; //take an empty temporary array
        int j=0; //count
        for(int i=0; i<n;i++){ //iterates the array
            if(arr[i]>0){ //if ele is greater than 0
                temp[j]=arr[i]; //stores the values in order in temp
                j++; //count increases
            }
        }
        for(int i=0; i<n;i++){ //iterates the array
            if(arr[i]<0){ //if ele is less than zero
                temp[j]=arr[i]; //stores the values less than zero in order
                j++; //count increases
            }
        }
        for(int i=0; i<n;i++){ //iterates the array
            arr[i]=temp[i]; //stores the sorted array in order to the temp array 
        }
    }
}

//=================================================================================================================

/*move all 0's to the end of it while maintaining the relative order of the non-zero elements*/

class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp=new int[nums.length]; //temp array for storing final result
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){ //if ele is not equal to zero 
                temp[count]=nums[i]; //store those values in a new array
                count++; //moves to next ele
            }
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){ //if ele is equal to zero
                temp[count]=nums[i]; //store that value in the new array
                count++; //next
            }
        }
        for(int i=0; i<nums.length;i++){
            nums[i]=temp[i]; //store those 2 arrays one after another into a single array
        }
        
    }
}
