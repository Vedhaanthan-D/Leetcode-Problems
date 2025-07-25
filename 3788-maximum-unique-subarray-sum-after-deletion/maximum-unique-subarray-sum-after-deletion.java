class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> result=new HashSet<>();
        int sum=0;
        for(int num:nums){
            result.add(num);
        }
        for(int num:result){
            if(num>0) sum+=num;
        }
        if(sum==0) return Collections.max(result);
        return sum;
    }
}