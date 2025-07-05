class Solution {
    public int findLucky(int[] arr) {
        int[] out = new int[501];
        for(int val : arr){
            out[val]+=1;
        }
        for(int i=500;i>0;i--){
            if(out[i]==i){
                return i;
            }
        }
        return -1;
    }
}