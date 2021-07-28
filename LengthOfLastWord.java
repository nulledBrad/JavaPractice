/*

Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Example 2:

Input: s = " "
Output: 0


*/


// ~~~~~~~~~~~~~~~~~~~~~~~~ SOLUTION

class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length()-1;
        int count =0;
        
        //Right to Left Checking Backwards
        //if some chars are left and char at spot == space subtract the length
        //this will remove trailing spaces first
        while(len >=0 && s.charAt(len)== ' ') --len;
        //while some chars left and chart at spot doesnt equal space
        while(len >=0 && s.charAt(len)!=' ') {
            //add to count and subtract from length
            ++count;
            --len;
        }
        return count;
    } 
}
