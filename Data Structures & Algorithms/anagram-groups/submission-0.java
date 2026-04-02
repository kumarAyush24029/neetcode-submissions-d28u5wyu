
// import java.util.*;

class Solution {
    boolean isAnagram(String s , String t) {
    if (s.length() != t.length()) {
        return false;
    }
    HashMap<Character, Integer> hm = new HashMap<>();
    for(int i=0; i<s.length();i++){
        char ch = s.charAt(i);
        if(!hm.containsKey(ch)){
            hm.put(ch,1);
        }
        else {
            hm.put(ch,hm.get(ch)+1);
        }

    }
    
    for(int j=0; j<t.length(); j++){
        char ch = t.charAt(j);
        if(!hm.containsKey(ch)){
            return false;
        }
        hm.put(ch,hm.get(ch)-1);
    }

    for(int value:hm.values()){
        if(value!=0) return false;

    }
    return true;


}
    public List<List<String>> groupAnagrams(String[] strs) {

       
         
 
        List<List<String>> res = new ArrayList<>();
        
        int[] flag =new int[strs.length];

        for(int i=0;i<strs.length;i++){

            List<String> alst = new ArrayList<>();
            if(flag[i]==1) continue;
            alst.add(strs[i]);

            for(int j=i+1;j<strs.length;j++){

                if(isAnagram(strs[i],strs[j]) && flag[j]!=1){
                    alst.add(strs[j]);
                    flag[j]=1;

                }
            }
            res.add(alst);


        }
        return res;
    }
}