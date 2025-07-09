class Solution {
    public void moveZeroes(int[] nums) {
        int j,i;
        j=-1;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return ;
        for(i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }
        }
    }
}