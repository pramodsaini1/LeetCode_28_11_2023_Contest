import java.util.HashSet;

public class missReap {
     public int[] findMissingAndRepeatedValues(int[][] grid) {
         int len=grid.length;
        int lent=grid[0].length;
        int values=len*lent;
        int ans[]=new int[2];
        HashSet<Integer>h=new HashSet<>();
        HashSet<Integer>ht=new HashSet<>();
        for(int i=0;i<=values;i++){
            ht.add(i);
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<lent;j++){
                int value=grid[i][j];
                ht.remove(value);
                if(h.contains(value)){
                    ans[0]=value;
                }
                else{
                    h.add(value);
                }
            }
        }
        for(Integer gotr:ht){
            ans[1]=gotr;
        }
        return ans;
}
/*
 * You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

 

Example 1:

Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
Example 2:

Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
Output: [9,5]
Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
 */
