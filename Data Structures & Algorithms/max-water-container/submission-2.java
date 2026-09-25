class Solution {
    public int maxArea(int[] h) {
        int l=0;
        int r=h.length-1;
        int max=0;
        while(l<r){
            int maxh=Math.min(h[l],h[r]);
            max= Math.max (max ,maxh*(( (r+1) - (l+1))));
            if(h[l]<h[r])l++;
            else r--;
        }
    return max;}
}
