import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] numArr = phone_number.split("");
        
        try{
            
        for(int i = numArr.length-5; i >= 0; i--){
            numArr[i] = "*";
        }
        
        for(String temp : numArr)
            answer += temp;
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        
        return answer;
    }
}