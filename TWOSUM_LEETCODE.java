/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SOLUTION ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class Solution {
    public int[] twoSum(int[] nums, int target) {
       // create arrary to return the indicies
        int ans[] = new int[2];
        //starts at spot 0 and iterates through values in a manner such as: [0,1], [0,2], [0,3]
        for(int i=0;i<nums.length;++i) 
        {
            //starts at spot next to i
            for(int j=i+1;j<nums.length;++j) 
            {
     
                // if spot i and j == target set indicies to new array and return
                if(nums[i] + nums[j] == target) 
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
                //doest match go to spot 0 and 2 until it reaches the end
            }   
        }
      // if nothing matches return empty array
        return ans;
    }
}
