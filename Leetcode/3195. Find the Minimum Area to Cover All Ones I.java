class Solution {
    public int minimumArea(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int top=m;
        int bottom=-1;
        int left=n;
        int right=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    left=Math.min(left,j);
                    right=Math.max(right,j);
                    top=Math.min(top,i);
                    bottom=Math.max(bottom,i);
                }
            }
        }
        return (bottom-top+1)*(right-left+1);
    }
}
