class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder answer = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
                if(count >1){
                    answer.append(ch);
                }
            }
        

            else {
                count--;
                if(count >0){
                    answer.append(ch);
            }
        }
    }
         return answer.toString();
        
    }
}