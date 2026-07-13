class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> cnt=new HashMap<>();
        for(int n:nums){
            cnt.put(n,cnt.getOrDefault(n,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(cnt.entrySet());

        list.sort((a,b)-> b.getValue()-a.getValue());

        int[] num=new int[k];
        for(int i=0;i<k;i++){
            num[i]=list.get(i).getKey();
        }
        return num;
    }
}