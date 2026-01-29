class Solution {
public:
    bool bfs(vector<vector<int>>& graph,int cur,vector<int>& sets){
        sets[cur]=0;
        queue<int> q;
        q.push(cur);
        while(!q.empty()){
            int u=q.front();
            q.pop();
            for(int i=0;i<graph[u].size();i++){
                int v=graph[u][i];
                if(sets[v] == -1){
                    sets[v]= !sets[u];
                    q.push(v);
                }
                else if(sets[u] == sets[v]) return false;
            }
        }
        return true;
    }
    bool isBipartite(vector<vector<int>>& graph) {
        int n=graph.size();
        vector<int> sets(n,-1);
        for(int i=0;i<n;i++){
            if(sets[i] == -1){
                if(bfs(graph,i,sets) == false){
                    return false;
                }
            }
        }
        return true;
    }
};