class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while(word.length()<k){
            int len = word.length();
            for(int i = 0 ; i<len ; i++){
                char ch = word.charAt(i);
                char nextword = (char)((ch-'a'+1)%26+'a'); 
                word.append(nextword);
            }
        }
        return word.charAt(k-1);
    }
}