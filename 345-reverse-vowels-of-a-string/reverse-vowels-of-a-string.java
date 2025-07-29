class Solution {
    public String reverseVowels(String s) {
        char[] word=s.toCharArray();
        int left=0,right=word.length-1;
        while(left<right){
            if(!isVowel(word[left])){
                left++;
            }
            else if(!isVowel(word[right])){
                right--;
            }
            else{
                char temp=word[left];
                word[left]=word[right];
                word[right]=temp;
                left++;
                right--;
            }
        }
        return new String(word);
    }
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}