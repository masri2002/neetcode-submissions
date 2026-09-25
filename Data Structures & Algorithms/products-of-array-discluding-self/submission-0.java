class Solution {
    public int[] productExceptSelf(int[] nums) {
    int xxx [] =new int [nums.length];
     
      xxx[0]=1;
      int pre=1;
     
      for(int i=1;i<nums.length;i++){
     pre=xxx[i-1]*nums[i-1];
                xxx[i]=pre;

        }
         int yyy [] =new int [nums.length];
         yyy[nums.length-1]=xxx[nums.length-1];
          int post=1;
       for(int i=nums.length-2;i>=0;i--){
         
           post = post * (nums[i+1]);
          yyy[i]=xxx[i]*post;
       }

        return yyy ;
}  
}
