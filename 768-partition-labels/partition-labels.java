class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> lastoccur=new HashMap<>();
        for(int i=0;i<s.length();i++){
            lastoccur.put(s.charAt(i),i);
        }

        List<Integer> l1=new ArrayList<>();

        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            end=Math.max(end,lastoccur.get(s.charAt((i))));
            if(i == end){
                l1.add(end-start+1);
                start=i+1;
            }
        }
        return l1;
    }
}