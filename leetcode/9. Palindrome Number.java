class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String str = Integer.toString(x);
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String str2 = String.valueOf(chars);
        return str.equals(str2);
    }
}
