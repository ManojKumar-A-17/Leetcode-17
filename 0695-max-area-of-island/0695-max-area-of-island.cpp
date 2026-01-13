class Solution {
public:
    int count=0;
    void dfs(vector<vector<int>>& grid,int m,int n){
        if(m<0 || n<0 || m>=grid.size() || n>=grid[0].size() || grid[m][n] == 0){
            return;
        }
        grid[m][n]=0;
        count++;
        dfs(grid,m,n+1);
        dfs(grid,m-1,n);
        dfs(grid,m+1,n);
        dfs(grid,m,n-1);
    }
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int max=0;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[0].size();j++){
                if(grid[i][j] == 1){
                    count=0;
                    dfs(grid,i,j);
                    max=(max>count)?max:count;
                }
            }
        }
        return max;
    }
};