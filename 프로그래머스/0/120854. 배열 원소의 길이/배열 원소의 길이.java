import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
	        int[] answer = {};
	        
	        answer = new int[strlist.length];
	        
	        for(int i = 0; i < strlist.length; i++){
	        	String[] temp = strlist[i].split("");
	         
	            answer[i] = temp.length;
	        }
	        
	        return answer;
	    }
}