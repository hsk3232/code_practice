import java.util.*;

class Solution {        
    public long solution(long n) {
        long answer = 0;
        String tempWord = "";
        String word = "";
        
        tempWord = String.valueOf(n);
        String[] arr = tempWord.split("");
        
        int start = 0;
        while(start < arr.length - 1){
            int finish = arr.length - 1;
            for(int i = finish; i > start; i--){
                if(arr[i].compareTo(arr[i-1]) > 0){
                    String temp = arr[i-1]; arr[i-1] = arr[i]; arr[i] = temp;
                    finish = i;
                }
            }
            start = finish;         
        }
        
        for(String temp : arr){
            word += temp;
        }
        
        answer = Long.parseLong(word);
            
        return answer;
        }

}