class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> freq = new ArrayList();
        for(int x : nums){
            if(freq.contains(x)){
                return true;
            }else{
                freq.add(x);
            }
        } 
     return false;
    }
}