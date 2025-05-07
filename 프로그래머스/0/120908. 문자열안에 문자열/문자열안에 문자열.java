class Solution {
    public int solution(String str1, String str2) {
		String[] arrStr1 = str1.split("");
        String[] arrStr2 = str2.split("");

       for (int i = 0; i <= (arrStr1.length - arrStr2.length); i++) {
			int count = 0;
			
			if (arrStr2[0].equals(arrStr1[i])) {
				count++;
				for (int j = 1; j < arrStr2.length; j++) {
					if (arrStr2[j].equals(arrStr1[i + j])) {
						count++;
					}
					else {
						count = 0;
						break;
					}
				}					
		    }
			if (arrStr2.length == count) {
				return 1;
			}
		}
		
	return 2;
	}
       
}