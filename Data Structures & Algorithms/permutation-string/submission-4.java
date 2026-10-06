class Solution {
public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int l = 0;
        for (int i = s1.length(); i <= s2.length(); i++) {
            int size = 0;
            Map<Character, Integer> map1 = new HashMap<>(map);
            for (char c : s2.substring(l, i).toCharArray()) {
                if (!map.containsKey(c)) {
                    l++;
                    break;
                } else if (map1.get(c) > 0) {
                    map1.put(c, map1.get(c) - 1);
                    size++;
                } else {
                    l++;
                }
            }
            if (size == s1.length()) {
                return true;
            }
        }
        return false;
    }
}
