class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for(int i = words.length-1;i>=0; i--){
            result = result.append(words[i]);
            if(i!= 0){
             result = result.append(" ");
            }
        }
        return result.toString();
    }
}