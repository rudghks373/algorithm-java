class Solution {
    public String reverseWords(String s) {
        String[] strDis = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strDis.length; i++){
            char[] charArray = strDis[i].toCharArray();
            int left = 0;
            int right = charArray.length-1;
            while(left < right){
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            ans.append(String.valueOf(charArray));
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
