class Solution {
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int solution(int balls, int share) {
        int k = Math.min(share, balls - share); // 대칭성
        if (k == 0) return 1;

        long ans = 1;
        for (int i = 1; i <= k; i++) {
            long num = balls - k + i; // 곱할 분자
            long den = i;             // 나눌 분모

            // 1) 현재 ans와 분모를 먼저 약분
            long g1 = gcd(ans, den);
            ans /= g1;
            den /= g1;

            // 2) 남은 분모와 분자를 약분
            long g2 = gcd(num, den);
            num /= g2;
            den /= g2; // 여기서 보통 1이 됨

            // 3) 안전하게 곱하기
            ans *= num;
        }
        return (int) ans; // 결과는 int 범위 내
    }
}
