class Solution {
    public void reverseString(char[] s) { //character array
        int i=0, j=s.length-1; // initializing first and last position
        while(i<j){
            char temp=s[i]; //DATA TYPE IS IMP, temp is storing the first character
            s[i]=s[j]; //the last char value is getting assigned to the first char value
            s[j]=temp; //last value is getting stored at the place of last value
            i++; //incrementing index from the left
            j--; //decrementing index from the right
        }
    }
}
