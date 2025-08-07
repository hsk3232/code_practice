class Solution {
    public int solution(int hp) {
        int captain = 0;
        int solider = 0;
        int worker = 0;
        int reduceHp = 0;
        int tempHp = 0;
        
        if(hp == 0){
            return 0;
        }
        if(hp < 3) {
             worker = hp;
        }
        
        else if (hp < 5 ){
            reduceHp = hp;
            solider = reduceHp / 3;
              reduceHp -= (solider*3);
                if(reduceHp > 0){
                  worker = reduceHp;
                }
        }
        else if (hp == 5){
            captain = 1;
        }
        else if(hp > 5){
            reduceHp = tempHp = hp;
            captain = tempHp / 5;
            reduceHp -= (captain*5);
            if(reduceHp > 0)
              solider = reduceHp / 3;
              reduceHp -= (solider*3);
                if(reduceHp > 0){
                  worker = reduceHp;  
            }
        }

        int answer = 0;
        answer = captain + solider + worker;
        return answer;
    }
}