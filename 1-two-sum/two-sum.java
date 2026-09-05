class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        Map<Integer,Integer> box=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int more=target-num;
            if(box.containsKey(more)){
                ans[0]=box.get(more);
                ans[1]=i;
            }
            box.put(num,i);
        }
        return ans;
    }
}