import java.util.*;
class Solution {
    public String solution(String s) {
        int[] result = Arrays.stream(s.split(" "))
        		.mapToInt(Integer::parseInt)
        		.collect(() -> new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE},
        		(arr, val) -> {
        			arr[0] = Math.min(arr[0], val);
        			arr[1] = Math.max(arr[1], val);
        		}, 
        		(arr1, arr2) -> {
        			arr1[0] = Math.min(arr1[0], arr2[0]);
        			arr1[1] = Math.max(arr1[1], arr2[1]);
        		});
        		
        		return result[0] + " " + result[1];
    }
}