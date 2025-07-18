class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> box = new HashMap<>();
        box.put('I', 1);
        box.put('V', 5);
        box.put('X', 10);
        box.put('L', 50);
        box.put('C', 100);
        box.put('D', 500);
        box.put('M', 1000);
        
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = box.get(s.charAt(i));
            if (i + 1 < s.length() && val < box.get(s.charAt(i + 1))) {
                res -= val;
            } else {
                res += val;
            }
        }
        return res;
    }
}
