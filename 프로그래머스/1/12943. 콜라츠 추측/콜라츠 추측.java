import java.util.*;

class Solution {
	public int solution(int num) {
		int answer = 0;
		int k = 0;
		int temp = num;

		if (num == 1) {answer = 0;} 
		else {
			while (k < 501) {
				if (temp == 1) {
					answer = k/2;
					break;
				} else if (temp % 2 == 0) {
					temp /= 2;
					k++;
				} else if (temp % 2 != 0) {
					temp *= 3;
					temp += 1;
					k++;
				} k++;
				if (k == 500) {
					answer = -1;
				}
			}
		}
		return answer;
    }

}