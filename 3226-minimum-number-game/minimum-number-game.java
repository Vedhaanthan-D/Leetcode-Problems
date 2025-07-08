class Solution {
    public int[] numberGame(int[] n) {
        int len = n.length;
        Arrays.sort(n);
        for(int i=0;i<len;i+=2){
        if(i+1 < len){
            int temp = n[i];
            n[i]=n[i+1];
            n[i+1]=temp;
         }
        }
        return n;
    }
}