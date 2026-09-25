class Solution {
     public int characterReplacement(String s, int k) {
        int max = 0;
        int pos = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(i)));
            while (i - pos + 1 - maxFreq > k) {
                map.put(s.charAt(pos), map.get(s.charAt(pos)) - 1);
                pos++;
            }
            max = Math.max(i - pos + 1, max);
        }
        return max;
    }
}
