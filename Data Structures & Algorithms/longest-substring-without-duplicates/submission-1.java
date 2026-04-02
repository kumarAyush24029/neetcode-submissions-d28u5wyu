class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl=0;
        int curr=0;
        while(s.length()-curr>maxl){
            int count=0;
            HashSet<Character> hs = new HashSet<>();
            for(int i=curr;i<s.length();i++){
                if(!hs.contains(s.charAt(i))){
                    count+=1;
                    hs.add(s.charAt(i));
                }
                else{
                    curr++;
                    break;
                }
                maxl=Math.max(count,maxl);


            }
        }
        return maxl;
        
    }
}
