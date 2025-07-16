class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        int oddcount=nums[0]%2==1?1:0;
        int evencount=nums[0]%2==0?1:0;
        int alt=1;
        boolean expecting_even=nums[0]%2==1?true:false;
        for(int i=1;i<n;i++){
            if(expecting_even==true && nums[i]%2==0|| expecting_even==false && nums[i]%2==1){
                alt++;
                expecting_even=!expecting_even;
            }
            if(nums[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        return Math.max(Math.max(oddcount,evencount),alt);
    }
}