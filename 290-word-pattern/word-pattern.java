class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");

        if(pattern.length()!=words.length){
            return false;
        }

        Map<Character,String> assign=new HashMap<>();
        Set<String> word=new HashSet<>();

        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String w=words[i];

            if(assign.containsKey(c)){
                if(!assign.get(c).equals(w)){
                    return false;
                }
            }else{
                if(word.contains(w)){
                       return false;
                   }
                }
            assign.put(c,w);
            word.add(w);
            }
            
            return true;
        }
        
    }
