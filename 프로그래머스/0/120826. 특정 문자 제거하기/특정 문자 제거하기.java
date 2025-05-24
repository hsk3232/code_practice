class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        String[] arrStr = my_string.split("");
        for(int i = 0; i < arrStr.length; i++){
            if(!arrStr[i].equals(letter)){
                answer += arrStr[i];
                
            }
        }
        
        return answer;
    }
}