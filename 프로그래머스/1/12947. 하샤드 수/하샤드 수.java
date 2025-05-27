class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        
        String[] arr = String.valueOf(x).split("");
        int[] sumArr = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            sumArr[i] = Integer.parseInt(arr[i]);
            sum += sumArr[i];
        }
        
        if(x % sum == 0){
            answer = true;
        }
        
        return answer;
    }
}