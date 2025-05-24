class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] my_String = my_string.split("");
        String[] arrTemp = new String[my_String.length];
        
        for(int i = 0; i < arrTemp.length; i++){
            arrTemp[i] = my_String[my_String.length-1-i];
        }
        
        for(String revers : arrTemp){
            answer += revers;
        }
        
        return answer;
    }
}