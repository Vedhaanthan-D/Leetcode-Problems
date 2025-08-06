class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=el1){
                cnt2=1;
                el2=nums[i];
            }
            else if(el1==nums[i]){
                cnt1++;
            }
            else if(el2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int c1=0,c2=0;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==el1){
                c1++;
            }
            if(nums[i]==el2){
                c2++;
            }
        }
        int min=(int)n/3+1;
        if(c1>=min){
            res.add(el1);
        }
        if(c2>=min){
            res.add(el2);
        }
        return res;
    }
}