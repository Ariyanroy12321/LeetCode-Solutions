class Solution {
    public void rotate(int[][] matrix) {

        int s=matrix.length;
        int[][] ans=new int[s][s];

        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                ans[j][s-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                matrix[i][j]=ans[i][j];
            }
        }
    }
}