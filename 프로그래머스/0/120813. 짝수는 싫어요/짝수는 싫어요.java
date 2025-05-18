class Solution {
    public int[] solution(int n) {
        int[] answer;
        
        if(n % 2 == 0){
            int i = 0;
            answer = new int[n/2];
            while(i < n/2){
                for(int j = 1; j <= n/2; j++){
                    answer[i] = (2*j)-1;
                    i++;
                }    
            }
        }
        
        else{
            int i = 0;
            answer = new int[n/2+1];
            while(i <= n/2){
                for(int j = 1; j <= n/2+1; j++){
                    answer[i] = 2*j-1;
                    i++;
                }
            }
        }
        return answer;
    }
}