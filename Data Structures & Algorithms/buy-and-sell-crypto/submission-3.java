class Solution {
     public int maxProfit(int[] prices) {
       int minStock=453609460;
       int max=0;
       for(int n:prices){
        minStock = Math.min(minStock,n);
        max=Math.max(max,n-minStock);
       }
       return max;
    }
}
