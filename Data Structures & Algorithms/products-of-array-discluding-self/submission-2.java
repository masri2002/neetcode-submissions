class Solution {
    public int[] productExceptSelf(int[] nums) {
    int ar [] =new int [nums.length];
     ar[0]=nums[0];
     int pre=1;
     for (int i =1;i<=nums.length;i++){//2
          ar[i-1]=pre;
       pre=pre*nums[i-1];
   
     }
     int post=1;
     for(int i = nums.length-1 ; i>=0;i--){
        ar[i]=post*ar[i];
        post=post*nums[i];
     }
     return ar;
}  
}

