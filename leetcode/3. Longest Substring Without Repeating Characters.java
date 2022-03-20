class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1)
            return 1;
        
        int left = 0;
        int right = 0;
        int result = 0;
        HashSet<Character> chars = new HashSet();
        while(right < s.length()){
            if(!chars.contains(s.charAt(right))){
                chars.add(s.charAt(right));
                result = Math.max(result, chars.size());
                right++;
            }else{
                left++;
                right= left;
                chars.clear();
            }
        }
        return result;
    }
}
