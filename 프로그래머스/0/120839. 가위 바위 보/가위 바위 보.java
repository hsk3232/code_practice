import java.util.*;

class Solution {
    public String solution(String rsp) {
        
      String answer = "";
        List<String> list = List.of(rsp.split(""));
        for (String a : list) {
            if (a.equals("2")) {
                a = a.replace("2", "0");
            } else if (a.equals("5")) {
                a = a.replace("5", "2");
            } else {
               a =  a.replace("0", "5");
            }
            answer += a;
            
        }
        return answer;
    }
}