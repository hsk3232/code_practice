class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int start = 0;        
        int mid = (array.length -1) / 2;
        
        
        while(start < array.length -1){
             int last = array.length -1;
            for(int i = last; i > start; i--){
                if(array[i] < array[i-1]){
                    swap(array, i-1, i);
                    last = i;
                }
                
            }
            start = last;
        }
        answer = array[mid];
        
        
        return answer;
    }
    
    public void swap(int[] a, int index1, int index2){
        int temp = a[index1]; a[index1] = a[index2]; 
        a[index2] = temp;
    }
}