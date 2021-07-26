/*

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:
Input: x = 123
Output: 321

*/
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SOLUTION ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class Solution {
    public int reverse(int x) {
        //set the reverse to zero
        int reverse =0;
        // while x != zero
        while(x != 0) {
            //get the last digit of the number
            int remainder = x % 10;
            // set reverse to reverse * 10 + remainder
            reverse = reverse * 10 + remainder;
            //remove last digit from number
            x = x/10;
        }
        return reverse;
    }
}
/*
Example 5213
remainder = 5213 % 10 = 3
reverse  = 0 * 10 + 3 = 3;
x = 5213/10 or 521;

remainder  = 521 % 10 = 1
reverse = 3* 10+ 1 = 31
x = 521/10 = 52

remainder = 52 % 10 = 2
reverse = 31*10 + 2= 312
x = 52/10 = 5

remainder = 5 % 10 = 5
reverse = 312 * 10 + 5
x = 5/10 = 0

reverse = 3125;


*/
