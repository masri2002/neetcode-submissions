class Solution {
       Map<Character, Integer> freq = new HashMap<>();
       public boolean isAnagram(String s, String t) {
              if (s.length()!=t.length()) return false;
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (freq.containsKey(c)) {
                if (freq.get(c) < 1) {
                    return false;
                } else {
                    freq.put(c, freq.get(c) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}