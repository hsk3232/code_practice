import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
       List<Integer> list = new ArrayList<>();
        int sqrt = (int)Math.sqrt(n);
        System.out.println("1: "+sqrt);
        
        for(int i = 1; i <= sqrt; i++){
            if(n%i == 0){
                list.add(i);
                if(i != n/i){
                    list.add(n/i);
                }
            }
        }
    
         answer = list.size();
               
        return answer;
        
    }
}