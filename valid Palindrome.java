/*converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers*/

class Solution {
    public boolean isPalindrome(String s) { 
        if(s.isEmpty() || s==null){ //checks if the string is empty or null
            return true; //returns true if yes
        }
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase(); //converting the given string into a alphanumeric string by replacing all non-aphanum characters by nothing
        //s=s.toLowerCase(); -> converting to lower case
        int n=s.length(), m=n-1; //assigning the length
        for(int i=0;i<n/2;i++){ //loops till the middle of the given string 
            if(s.charAt(i)!=s.charAt(m-i)){ //checks if the first half and next half of the string is equal or not
              //0!=(5-0), index checking like this 
                return false; //returns false when they are not equal meaning not palindrome
            }
        }
        return true; //palindrome
    }
}
