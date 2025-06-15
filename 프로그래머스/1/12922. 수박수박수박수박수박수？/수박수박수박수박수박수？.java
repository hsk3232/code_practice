class Solution {
    public String solution(int n) {
        String answer = "";
        String word = "수박";
        if(n%2 == 0){
           for(int i = 1; i <= n/2; i++){
               answer += word;
           }
       }
        else{
            String[] words = {"수", "박"};
            int k = 0;
            
            while(k < n){
                if(k%2 == 0){
                    answer += words[0];
                    k++;
                }
                else{
                    answer += words[1];
                    k++;
                }
                
                }
                
            }
        
        return answer;
    }
}