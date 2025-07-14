class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum=0;
        int[] arr=new int[2];
       int i=0,j=numbers.length-1;
       while(i<j){
        int ans=numbers[i]+numbers[j];
        if(ans<target){
            i++;
        }else if(ans>target){
            j--;
        }else{
            return new int[]{i+1,j+1};
        }
       }
      return new int[]{-1,-1};

    }
}