class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n<2) return true;

        int fall=0;
        for(int i= 1;i<n;i++){
            if(nums[i]<nums[i-1]){
                fall++;
            }
        }
        if(nums[n-1]>nums[0]){
            fall++;
        }
        
        if(fall<=1){
                return true;
            }
        return false;
    }
}