class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            while(nums[i]>0 && nums[i]<n && nums[i]!=nums[nums[i]-1]){
                int crt = nums[i]-1;//-1

                int temp = nums[i];//3
                //swap
                nums[i]= nums[crt];//-1
                nums[crt]=temp;//3
            }
        }
            for(int i=0;i<n;i++){
                if(nums[i]!=i+1){
                    return i+1;
                }
        }
        return n+1;
    }
}