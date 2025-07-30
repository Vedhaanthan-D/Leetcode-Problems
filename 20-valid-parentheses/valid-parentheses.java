class Solution {
    public boolean isValid(String s) {
        Stack<Character> box=new Stack<>(); 
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                box.push(s.charAt(i));
            }
            else{
                if(box.isEmpty()){
                    return false;
                    }
                    char c=box.pop();
                    if(s.charAt(i)==')' && c!='('||s.charAt(i)==']' && c!='[' || s.charAt(i)=='}' && c!='{'){
                        return false;
                    }
            }
            
        }
     return box.isEmpty();
    
    }
}