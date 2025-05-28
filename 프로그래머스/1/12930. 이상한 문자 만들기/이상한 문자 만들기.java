import java.util.*;

class Solution {
	public static String solution(String s) {
		String answer = "";
        String tempWord = "";
		String[] arr = s.split("");
        int  count = 0;
        
        for(int i = 0; i < arr.length; i++){             
            if(arr[i].equals(" ")){
                arr[i] = arr[i];
                count = 0;
            }
            
            else if(!arr[i].equals(" ")){
                if(count == 0 || count % 2 == 0){
                    tempWord = arr[i].toUpperCase();
                    arr[i] = tempWord;
                }
                else{
                    arr[i] = arr[i].toLowerCase();
                }
                count++;
            }
        }
        for(String sepl : arr)
            answer += sepl;
		return answer;
	}
}
