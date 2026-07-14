class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> box=new PriorityQueue<>();
        for(int num:nums){
            box.add(num);
            if(box.size()>k){
                box.poll();
            }
        }
        return box.peek();
    }
}