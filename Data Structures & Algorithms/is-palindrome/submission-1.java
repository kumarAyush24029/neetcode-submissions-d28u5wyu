class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(Character.isLetterOrDigit(ch)){

                sb.append(Character.toLowerCase(s.charAt(i)));
            }


        }
        String news= sb.toString();
        String reversed = new StringBuilder(news).reverse().toString();    
        if(news.equals(reversed)) return true;
        return false;
    }
}
