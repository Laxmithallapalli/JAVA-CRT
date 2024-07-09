class Solution {
    public int maxSubArray(int[] nums) {
        int gs=nums[0],cs=0;
        for(int i=0;i<nums.length;i++)
        {
            cs=cs+nums[i];
            if(gs<cs)
            gs=cs;
            if(cs<0)
            cs=0;
        }
        return gs;
    }
}
