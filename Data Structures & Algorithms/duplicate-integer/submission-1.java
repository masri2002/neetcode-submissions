class Solution {
    public boolean hasDuplicate(int[] nums) {
       Map<Integer , Integer> freq = new HashMap();

       for(int i :nums){
        if(freq.containsKey(i)){
            freq.put(i,freq.get(i)+1);
        } else{
            freq.put(i,1);
        }

        if(freq.get(i)>1){
            return true;
        }
       }
       return false;
    }
}
