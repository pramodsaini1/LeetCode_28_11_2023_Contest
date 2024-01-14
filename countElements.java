import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countElements {
    public int maxFrequencyElements(int[] nums) {
            Arrays.sort(nums);
           Map<Integer,Integer> map=new HashMap<>();
           for(int i=0;i<nums.length;i++){
               if(map.containsKey(nums[i])){
                   map.put(nums[i],map.get(nums[i])+1);
               }
               else{
                   map.put(nums[i],1);
               }
           }
           int max=0;
           for(Map.Entry<Integer,Integer> e:map.entrySet()){
               if(e.getValue()>max){
                   max=Math.max(max,e.getValue());
               }
           }
           if(max==1){
               return nums.length;
           }
           int count=0;
           for(int i=0;i<nums.length-max+1;i++){
               if(nums[i]==nums[i+max-1]){
                   count +=max;
                   i=i+max-1;
               }
           }
        return count;
         
    }
}
/*
 * You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

 

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
 */
