class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<int , int>>q;
        int fresh=0;
        int m = grid.size();
        int n = grid[0].size();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1)fresh++;
                else if(grid[i][j] == 2){
                    q.push({i,j});
                }
            }
        }
        int t = 0;
        while(!q.empty()){
            int size = q.size();
            while(size-- > 0){
                pair<int,int> op = q.front();
                q.pop();
                int r = op.first;
                int c = op.second;
                // right
                if(c+1 < n && grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    fresh--;
                    q.push({r,c+1});
                }
                // left
                if(c-1 >=0 && grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    fresh--;
                    q.push({r,c-1});
                }
                // up
                if(r+1 < m && grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    fresh--;
                    q.push({r+1,c});
                }
                // down
                if(r-1 >=0 && grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    fresh--;
                    q.push({r-1,c});
                }
            }
            if(!q.empty()){
                t++;
            }
        }
        return (fresh==0)?t:-1;
    }
};