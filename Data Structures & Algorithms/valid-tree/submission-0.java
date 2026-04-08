class Solution {
    Set<Integer> set = new HashSet<>();
    void dfs(int curr,Map<Integer,List<Integer>> adj){
        set.add(curr);
        for(int nei : adj.get(curr)){
            if(!set.contains(nei)){
                dfs(nei,adj);
            }

        }

        
        
    }
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1) return false;
        Map<Integer,List<Integer>> adj = new HashMap<>();
        
        for(int i=0;i<n;i++){
            adj.put(i,new ArrayList<>());
          
        }
        for(int[] edge : edges){
            int u =edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
          
        }
        dfs(0,adj);
        
        return (set.size()==n);


    }
}
