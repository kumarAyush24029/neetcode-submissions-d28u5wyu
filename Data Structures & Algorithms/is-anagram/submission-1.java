class Solution {
    public boolean isAnagram(String s, String t) {
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
        System.out.println(hm);
        for(int j=0; j<t.length(); j++){
            char ch = t.charAt(j);
            if(!hm.containsKey(ch)){
                return false;
            }
            hm.put(ch,hm.get(ch)-1);
        }
        System.out.println(hm);
        for(int value:hm.values()){
            if(value!=0) return false;

        }
        return true;


    }
}
