class Solution {
    public static boolean searchMatrix(int[][] m, int target) {
        int i=0;
        while(i<m.length){
            int l=0;
            int r=m[i].length-1;
            if(m[i][r]<target){
                i++;
            }else{
                while(l<=r){
                    int mid=l+(r-l)/2;
                    if(m[i][mid]==target)return true;
                    else if(m[i][mid]<target){
                        l=mid+1;
                    }else{
                        r=mid-1;
                    }
                }
i++;
            }

        }
        return false;
    }

}
