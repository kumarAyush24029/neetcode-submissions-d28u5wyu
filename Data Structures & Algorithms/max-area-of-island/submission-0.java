class Solution {

    public int dfs(int[][]grid,int i,int j,int count){
        if(grid[i][j]==0) return 0;
        if(grid[i][j]==1){
            count+=1;
            grid[i][j]=0;
            if(j+1<grid[0].length) count+= dfs(grid,i,j+1,0);
            if(j-1>=0)count+= dfs(grid,i,j-1,0);
            if(i+1<grid.length)count+= dfs(grid,i+1,j,0);
            if(i-1>=0)count+= dfs(grid,i-1,j,0);
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count = Math.max(count,dfs(grid,i,j,0));
                }
            }
        }
        return count;
        
    }
}
