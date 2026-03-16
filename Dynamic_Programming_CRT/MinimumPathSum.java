public class MinimumPathSum {
    public int minPathSum(int[][] grid)
    {
        int s=0;
        //  int dp[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            grid[i][0]+=s;
            s=grid[i][0];
        }
        s=0;
        for(int i=0;i<grid[0].length;i++)
        {
            grid[0][i]+=s;
            s=grid[0][i];
        }
        for(int i=1;i<grid.length;i++)
        {
            for(int j=1;j<grid[0].length;j++)
            {
                grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        return grid[grid.length-1][grid[0].length-1];



    }
}
