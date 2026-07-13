class Solution {
    public boolean isHappy(int n) {
        Set<Integer> box=new HashSet<>();

        while(!box.contains(n)){
            box.add(n);
            n=getnum(n);
            if(n==1){
                return true;
            }
        }
        return false;        
    }
    private int getnum(int n){
            int res=0;
            while(n>0){
                int rem=n%10;
                res+=rem*rem;
                n=n/10;
            }
            return res;
        }
}