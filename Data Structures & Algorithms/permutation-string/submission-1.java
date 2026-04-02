class Solution {
    boolean isanagram(String x , String y){
            // List<Character> ls1= new ArrayList<>();
            List<Character> ls2 = new ArrayList<>();
            for(int i=0;i<y.length();i++){
                ls2.add(y.charAt(i));
            }
            for(int j=0;j<x.length();j++){
                if(ls2.size()==0) return false;
                if(!ls2.contains(x.charAt(j))){
                    return false;
                }
                ls2.remove(Character.valueOf(x.charAt(j)));
            }
            if(ls2.size()==0) return true;
            return false;

        }
    public boolean checkInclusion(String s1, String s2) {
        
        for(int t=0;t<=s2.length()-s1.length();t++){
            if(isanagram(s1,s2.substring(t,t+s1.length()))){
                return true;
            }
        }
        return false;
        
        
        
    }
}