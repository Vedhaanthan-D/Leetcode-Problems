class Solution {
    public String convertToBase7(int num) {
        if(num ==  0) return "0";
        boolean neg = num <0;
        num = Math.abs(num);

        StringBuilder ans=new StringBuilder();

        while(num>0){
            ans.append(num%7);
            num=num/7;
        }
        if(neg){
            ans.append("-");
        }
        return ans.reverse().toString();
    }
}