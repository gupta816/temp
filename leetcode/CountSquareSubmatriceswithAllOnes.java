class Solution {
    public int countSquares(int[][] mat) {
         int m=mat.length;
        int ans=0;
        int n=mat[0].length;
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(mat[i][j]!=0)
                {
                    mat[i][j]=Math.min(mat[i-1][j],Math.min(mat[i][j-1],
                                                            mat[i-1][j-1]))+1;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               ans+=mat[i][j];
            }
        }
        return ans;
        
    }
}
