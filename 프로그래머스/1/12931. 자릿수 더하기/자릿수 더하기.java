import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
       
        String num = String.valueOf(n);
        String[] st = num.split("");
        
        for(int i = 0; i < st.length; i++) {
            answer += Integer.parseInt(st[i]);
        }
              // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}