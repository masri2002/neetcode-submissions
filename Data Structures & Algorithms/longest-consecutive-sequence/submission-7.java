class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int i : nums){
        set.add(i);
       }
       int count=0;
       for (int i : set){
        if(!set.contains(i-1)){
            int l=1;
            while(set.contains(i+l)){
                l++;
            }
            count=Math.max(count,l);
        }
       }
 return count;
    
}
}
