class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cup = 0;
        
        if(money < 5500){
            answer[0] = 0;
            answer[1] = money;
        }
        else{ 
            while (money >= 5500){
                money -= 5500;
                cup++;
            }
            answer[0] = cup;
            answer[1] = money;
        }
        
        
        return answer;
    }
}