class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List> hs = new HashMap<>();
        String[] Arr = new String[strs.length];

        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String st = new String(arr);
            Arr[i] = st;

        }
        for(int j=0;j<Arr.length;j++){
            List<String> nw = new ArrayList<>();
            if(hs.containsKey(Arr[j])){
                // hs.get(Arr[j]).add(strs[j]);
                hs.get(Arr[j]).add(strs[j]);
            }
            else{    
                nw.add(strs[j]);    
                hs.put(Arr[j], nw);  
            }  
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> i:hs.values()){
            result.add(i);
        }
        return result;
    }
}
