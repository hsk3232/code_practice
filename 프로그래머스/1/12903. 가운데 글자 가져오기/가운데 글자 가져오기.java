class Solution {
    public String solution(String s) {
        String answer = "";
        String[] spel = s.split("");
        int mid = (spel.length-1)/2;
        
        if(spel.length % 2 == 0){
            answer = spel[mid] + spel[mid+1];
        }
        else{
            answer = spel[mid];
            
        }
        
        return answer;
    }
}