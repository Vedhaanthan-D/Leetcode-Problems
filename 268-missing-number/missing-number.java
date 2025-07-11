class Solution {
    public int missingNumber(int[] n) {
        int xor1 = 0, xor2 = 0;
        int len=n.length;
        for(int i=0;i<len;i++){
            xor2=xor2^n[i];
            xor1=xor1^(i+1);
        }
        
        return (xor1^xor2);
    }
}
