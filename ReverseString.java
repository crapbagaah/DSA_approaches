public class Solution {
    public String reverseString(String s) {
        char[] word = s.toCharArray(); //converting the String to a character array
        int i=0;
        int j=s.length()-1;
        while (i<j) { //reversing the characters
            char temp=word[i]; 
            word[i]=word[j];
            word[j]=temp;
            i++;
            j--;
        }
        return new String(word); //returning the reversed character array into a string
    }
}
