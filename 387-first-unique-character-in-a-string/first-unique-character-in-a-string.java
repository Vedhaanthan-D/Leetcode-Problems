class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[256];
        char[] character = s.toCharArray();
        for(char c :character ){
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[character[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}