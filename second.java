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
