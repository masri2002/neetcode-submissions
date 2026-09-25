class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap();
        int x=0;
        for(int i : nums){
       
            if(map.containsKey(target-i))
                return new int []{map.get(target-i),x }; 
                map.put(i,x);
             x++;
        }
   return new int [] {}; }
}
