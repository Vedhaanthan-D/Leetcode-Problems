class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> box=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int n:nums1){
            box.add(n);
        }
        for(int n:nums2){
            if(box.contains(n)){
                ans.add(n);
                box.remove(n);
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
        res[i]=ans.get(i);
        }
            
        return res;
    }
}