class Solution {
    public int solution(int n) {
        int answer = 0;
        // n이 7보다 작을 때
        if(n < 8){
            answer = 1;
        }
        else if(n % 7 == 0){
            answer = n / 7;
        }
        else if(n > 7){
            answer = n / 7 + 1;
        }
        
        return answer;
    }
}