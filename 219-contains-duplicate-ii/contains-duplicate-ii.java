class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mpp.containsKey(nums[i])){
                if(Math.abs(i-mpp.get(nums[i]))<=k){
                    return true;
                }
               
            }
            mpp.put(nums[i],i);
        }
        return false;
    }
}