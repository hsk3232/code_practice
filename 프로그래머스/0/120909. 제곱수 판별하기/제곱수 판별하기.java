import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);
        if(n == sqrt * sqrt){
            answer = 1;
        }
        else{
            answer = 2;
        }
        return answer;
    }
}