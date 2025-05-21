class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int son = numer1 * denom2 + numer2 * denom1; // 분자
        int mom = denom1 * denom2; // 분모

        int gcd = getGCD(son, mom); // 최대공약수 구하기

        return new int[] {son / gcd, mom / gcd}; // 기약 분수 반환
    }

    // 최대공약수 구하기 (유클리드 호제법)
    public int getGCD(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}