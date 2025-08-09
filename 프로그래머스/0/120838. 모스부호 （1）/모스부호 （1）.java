import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String [] arr = letter.split(" ");
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map <String, Integer> map = new HashMap<>();
        int i = 0;
        for(String word : morse){
            map.put(word, (97 + i++));
        }
        StringBuilder sb = new StringBuilder();
        for(String x : arr){
            int y = map.get(x);
                char z = (char) y;
            answer = sb.append(Character.toString(z)).toString();
        } 
        return answer;
    }
}