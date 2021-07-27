/*
Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
*/




// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SOL ~~~~~~~~~~~~~~~~~~~~
class Solution {
    public int strStr(String haystack, String needle) {
        //useIndex of needle
       return haystack.indexOf(needle);
        
/*
        if(needle.length()==0)
        {
            return 0;
        }
    int j=needle.length();
    for(int i=0;i<=haystack.length()-j;i++){
    //if haystack substring at i to i+needleLength equals needle then return i
        if(haystack.substring(i,i+j).equals(needle)){
            return i;
        
*/
    }
}
