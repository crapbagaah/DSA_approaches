class Solution {
    public int lengthOfLastWord(String s) {
        String newstr=s.trim(); //removing all the spaces before and after the string and stroing it at a new variable
        s=s.trim(); //removing all the spaces before and after the string and updating the String input
        int count=0; //for counting the length of last word
        int n=s.length()-1; //index var where we can iterate the loop from
        while(n>=0 && newstr.charAt(n)!=' '){ //if n is greater than zero and if at position n the characters are not empty, means it is the last word
            count++; //increment count for each character
            n--; //decrements n to move to the previous character
        }
        return count; //final length of last word is returned
    }
}
