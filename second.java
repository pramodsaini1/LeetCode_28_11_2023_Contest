package LeetCode_28_11_2023_Contest;

 public class Second {
    public int findKOr(int[] nums, int k) {
        int n = nums.length;
        int[] ct = new int[31];
        for (int i = 0; i < 31; ++i) {
            for (int x : nums) {
                if ((x&(1<<i))>0)
                    ++ct[i];
            }
        }
        int ans = 0;
        for (int i = 0; i < 31; ++i) {
            if (ct[i]>=k)
                ans += 1<<i;
        }
        return ans;
    }
}






/*
You are given a 0-indexed integer array nums, and an integer k.

The K-or of nums is a non-negative integer that satisfies the following:

The ith bit is set in the K-or if and only if there are at least k elements of nums in which bit i is set.
Return the K-or of nums.

Note that a bit i is set in x if (2i AND x) == 2i, where AND is the bitwise AND operator.




*/















