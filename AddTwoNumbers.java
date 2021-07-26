/*

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

*/


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SOLUTION ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
//create a new class result
    private class Result {
      //create a head and tail
        public ListNode head;
        public ListNode tail;
      //fill values with blank set of values
        public Result() {
            this.head = new ListNode();
            this.tail = head;
        }
        // create helper function to add to the end
        public void append(int val) {
            ListNode node = new ListNode(val);
            this.tail.next = node;
            this.tail = node;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //create a new resulting node
        Result result = new Result();
        //set carry to 0
        int carry = 0;
        
        // while left has some value and right has some value
        while (l1 != null || l2 != null) {
          // set first number to l1 if l1 == null set to 0 else set to l1.val
            int n1 = (l1 == null) ? 0 : l1.val;
            // same as above
            int n2 = (l2 == null) ? 0 : l2.val;
            // set sum to n1 + n2 + carry which is zero
            int sum = n1 + n2 + carry;
            //set add that number to the return list
            result.append(sum % 10);
            //carry = 0 if sum < 9 else its set to 1
            carry = (sum > 9) ? 1 : 0;
            //checks to see if l1 has a value and if n2 has a value if they do go to next iteration
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        //check carry one last time once its been completely ran through. If its greater than 0 add one.
        if (carry > 0) result.append(1);
        //return the head next value. 
        return result.head.next;
    }
}
