class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        return Arrays.equals(arr,arr2);

    }
}
