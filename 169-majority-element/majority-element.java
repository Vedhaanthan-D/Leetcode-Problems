class Solution {
    public int majorityElement(int[] arr) {
       int element=0;
       int n=arr.length;
       int count=0;
       for(int i=0;i<n;i++){
        if(count ==0){
            count=1;
            element=arr[i];
        }
        else if(arr[i]==element){
            count++;
        }
        else{
            count--;
        }
    }
        int c1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                c1++;
            }
        }
        if(c1>(n/2)){
            return element;
        }
        return -1;
    }
}