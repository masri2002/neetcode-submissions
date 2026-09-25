class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>>x=new HashSet<>();
    for(int i=0;i<nums.length-2;i++){
          int l=i+1;
          int r=nums.length-1;
          while(l<r){
            int a=nums[i];
            int b=nums[l];
            int c=nums[r];
            if(a+b+c==0){
                x.add(Arrays.asList(a,b,c));
            }if(a+b+c>0){
                r--;
            }else{
                l++;
            }
          } 
    }
     return new ArrayList<>(x);}
}
