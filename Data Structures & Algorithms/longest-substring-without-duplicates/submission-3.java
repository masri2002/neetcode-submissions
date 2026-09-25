class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==1){
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int pos = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                pos =Math.max(pos,(map.get(s.charAt(i)) + 1));
            }
            map.put(s.charAt(i), i);
            max = Math.max(max,i-pos+1);

        }
        return max;

    }
}
