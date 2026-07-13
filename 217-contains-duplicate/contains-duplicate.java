class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> box=new HashSet<>();

        for(int n:nums){
            if(box.contains(n)){
                return true;
            }
            box.add(n);
        }
        return false;
    }
}