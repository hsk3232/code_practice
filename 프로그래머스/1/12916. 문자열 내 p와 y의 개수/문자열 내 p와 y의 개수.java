import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase();
        String[] arr = s.split("");
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i < arr.length; i++){
            if("p".equals(arr[i])){
                pCount++;
                System.out.print(pCount);
            }
            else if("y".equals(arr[i])){
                yCount++;
                System.out.print(yCount);
            }
            
        }
        if(pCount != yCount){
            answer = false;
        }
        
        return answer;
    }
}