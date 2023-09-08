class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        int[] temp=new int[n+m];//temp array length till both the array lengths
        int count=1;//initial count is 1 as min ele present for union
        for(int i=0; i<n;i++){
            temp[i]=a[i]; //storing array1's values in temp
        }
        for(int j=0; j<m;j++){
            temp[n+j]=b[j]; //storing array2's values in temp after array1
        }
        Arrays.sort(temp); //sort the temp array with all the elements
        for(int i=0; i<temp.length-1;i++){ //iterates the array till before the length
            if(temp[i]!=temp[i+1]){ //checks if the adjacent values are equal or not
                count++; // if not equal, count increases
            }
        }
        return count;
    }
}
