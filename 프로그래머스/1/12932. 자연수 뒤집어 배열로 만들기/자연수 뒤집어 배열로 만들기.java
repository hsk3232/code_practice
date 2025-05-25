import java.util.*;

class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        String[] temp = num.split("");
        int[] answer = new int[temp.length];
        
        for(int i = 0; i < temp.length; i++){
            answer[i] = Integer.parseInt(temp[temp.length-1-i]);
        }
        
        
        return answer;
    }
}