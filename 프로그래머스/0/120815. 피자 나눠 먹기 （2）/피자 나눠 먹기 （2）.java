class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 6 == 0){
            answer = n / 6;
        }
        else {
            int i = 1;
            while (6*i % n != 0){    
                i++;
            }
            answer = i;
        }
        return answer;
    }
}