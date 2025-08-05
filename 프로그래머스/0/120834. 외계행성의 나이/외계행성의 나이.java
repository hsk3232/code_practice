import java.util.*;

class Solution {
    public String solution(int age) {
        Map<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < 10; i++){
            map.put(i, (char)('a'+i));
        }
        String num = Integer.toString(age);
        String [] arr = num.split("");
        String answer = "";
       for(String word : arr) {
    	   answer += map.get(Integer.parseInt(word));
       }
    	   
        return answer;
    }
}