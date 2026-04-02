class Solution {
    // Map<Pair<Integer,Integer>,Integer> visited = new HashMap<>();
    
    public int numIslands(char[][] grid) {
        record pair(int x ,int y){};
        Set<Pair<Integer,Integer>> visited = new HashSet<>();
        int count=0;
        int rows = grid.length;
        int columns = grid[0].length;

        class DFS{
            void dfs(Pair<Integer,Integer> landloc){
                if(visited.contains(landloc)) return;
                visited.add(landloc);
                int key = landloc.getKey();
                int value = landloc.getValue();
                if(value+1<columns && grid[key][value+1]=='1' && (!visited.contains(new Pair(key,value+1)))){
                    dfs(new Pair(key,value+1));
                }
                if(value-1>=0 && grid[key][value-1]=='1' && (!visited.contains(new Pair(key,value-1)))){
                    dfs(new Pair(key,value-1));
                }
                if(key+1<rows && grid[key+1][value]=='1' && (!visited.contains(new Pair(key+1,value)))){
                    dfs(new Pair(key+1,value));
                }
                if(key-1>=0 && grid[key-1][value]=='1' && (!visited.contains(new Pair(key-1,value)))){
                    dfs(new Pair(key-1,value));
                }
                
            }
        }

        DFS obj = new DFS();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j]=='1' && !visited.contains(new Pair(i,j))){
                    count+=1;
                    obj.dfs(new Pair(i,j));
                }
            }
        }
        return count; 
    }
}
