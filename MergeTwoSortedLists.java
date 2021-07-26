//Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
//Input: l1 = [1,2,4], l2 = [1,3,4]
//Output: [1,1,2,3,4,4]


/**
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        //Create NewNodes and BlankNode
        ListNode leftListNode = l1;
        ListNode rightListNode = l2;
        ListNode root = null;
        
        //While there is some value in left and right
        //Check to see which side is bigger and put it in new List
        
        while(leftListNode !=  null && rightListNode != null) {
        // if left value is smaller than right value
        if(leftListNode.val < rightListNode.val) {
          // insert left value and iterate to next value
            root = insert(root, leftListNode.val);
            leftListNode = leftListNode.next;
            
        }
        // if right value is smaller insert the right and iterate
        else {
            root = insert(root, rightListNode.val);
            rightListNode = rightListNode.next;
        }
        }
        // if right has no values and left does
        while(leftListNode != null) {
        // insert left and iterate
            root = insert(root, leftListNode.val);
            leftListNode = leftListNode.next;
        
        }
        // if left has no values and right does
        while(rightListNode != null) {
        // insert right and iterate
            root = insert(root, rightListNode.val);
            rightListNode = rightListNode.next;
        }
        return root;
    }
    // insert function
    public ListNode insert(ListNode root, int value) {
    // if root is empty add the value
    if(root == null) {
        root = new ListNode(value);
    }
    //if theres already some value in root
    else {
        // new last value becomes root
        ListNode last = root;
        // while there is some last value
        while(last.next != null) {
        //iterate to the next value
            last = last.next;
        }
        //finally set the value entered to the last value
        last.next = new ListNode(value);
    }
    return root;
}
}
