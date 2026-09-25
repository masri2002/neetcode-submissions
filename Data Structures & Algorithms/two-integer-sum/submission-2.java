class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap();
        int z=0;
      for(int x :nums){
            map.put(target-x,z++);
        }
        for(int i=0 ;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.containsKey(target-nums[i]) && map.get(nums[i])!=i)
                return new int []{
                i, map.get(nums[i])
                };
            }
        }
     return new int []{
                   
                };}
}
