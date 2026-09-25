class Solution {
    public int longestConsecutive(int[] nums) {
     
      if(nums.length==1)return 1;
      if(nums.length<2)return 0;
      Arrays.sort(nums);
        int count=1;
        ArrayList<Integer> list =new ArrayList();
        for(int i=0;i<nums.length-1;i++){
           if(nums[i]==nums[i+1])continue;
            if(nums[i]+1==nums[i+1])count++;
            else{
                count=1;
            }
            
            list.add(count);
            
        }
    Collections.sort(list);
    if(list.isEmpty())return 1;
    return list.get(list.size()-1);}
}
