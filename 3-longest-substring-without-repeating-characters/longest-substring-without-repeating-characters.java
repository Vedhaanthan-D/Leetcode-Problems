class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,n=s.length();
        int maxlen=0;
        Set<Character> res=new HashSet<>();
        while(r<n){
            if(!res.contains(s.charAt(r))){
                res.add(s.charAt(r));
                maxlen=Math.max(maxlen,r-l+1);
                r++;
            }
            else{
                res.remove(s.charAt(l));
                l++;
            }
        }
        return maxlen;
    }
}