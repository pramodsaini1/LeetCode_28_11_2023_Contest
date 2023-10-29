 
   public  class Solution {
        public long minSum(int[] nums1, int[] nums2) {
             long sum1=0;
            long sum2=0;
            int zero1=0;
            int zero2=0;
            for(int i=0;i<nums1.length;i++){
                sum1 = sum1+nums1[i];
                if(nums1[i]==0){
                    sum1++;
                    zero1++;
                }
            }
            for(int i=0;i<nums2.length;i++){
                sum2=sum2+nums2[i];
                if(nums2[i]==0){
                    sum2++;
                    zero2++;
                }
            }
            if(sum1==sum2){
                return sum1;
            }
            else{
                if(sum1<sum2){
                    if(zero1>0){
                        return sum2;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    if(zero2>0){
                        return sum1;
                    }
                    else{
                        return -1;
                    }
                }
            }
            
        }
    }

