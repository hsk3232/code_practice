import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        List <String> arr = new ArrayList<>();
        String answer = "";
        String[] myStr = my_string.split("");
        
        for(int i = 0; i < myStr.length; i++){
            int k = 0;
            while(k < n){
            	String word = myStr[i];
                arr.add(word);
                k++;
            }
        }
        for(String word : arr){
            answer += word;
        }
        return answer;
    
    }
}