import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        
        int[] answer = new int[emergency.length];
        Map<Integer, Integer> recoder = new HashMap<>();
        
        
        int[] newEmergency = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(newEmergency);
        
        
        int a = emergency.length;
        for(Integer num : newEmergency){
            recoder.put(num, a--);
            
        }

        	
        
        for(int i = 0; i < emergency.length; i++)
        	answer[i] = recoder.get(emergency[i]);
        
        	
        return answer;
    }
}