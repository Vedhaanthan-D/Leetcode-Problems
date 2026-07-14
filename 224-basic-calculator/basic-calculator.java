class Solution {
    public int calculate(String s) {
        Stack<Integer> box=new Stack<>();

        int res=0,curr=0,sign=1;

        for(char c:s.toCharArray()){
             if (Character.isDigit(c)) {
                curr = curr * 10 + (c - '0');
            }
            else if(c=='+'){
                res+=curr*sign;
                curr=0;sign=1;
            }
            else if(c=='-'){
                res+=curr*sign;
                curr=0;sign=-1;
            }
            else if(c=='('){
                box.push(res);
                box.push(sign);

                res=0;sign=1;curr=0;
            }
            else if(c==')'){
                res+=curr*sign;
                curr=0;
                res*=box.pop();
                res+=box.pop();
            }

        }
        res+=curr*sign;
        return res;
    }
}