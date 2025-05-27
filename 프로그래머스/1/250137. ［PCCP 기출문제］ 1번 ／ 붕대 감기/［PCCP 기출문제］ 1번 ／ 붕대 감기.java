class Solution {
	public int solution(int[] bandage, int health, int[][] attacks) {
		int finalAttack = attacks[attacks.length - 1][0];
		int answer = health;

		int k = 0;
		int i = 0;
		int count = 0;

		// 마지막 공격까지 시간의 흐름
		while (k <= finalAttack) {
            // attacks의 행을 돈다.
			while (i < attacks.length) {
                // 몬스터의 공격
				// 공격배열의 (i , 0) 시간과 시간의 흐름이 같다면
				if (k == attacks[i][0]) {
					// 현제 체력에서 데미지(i , 1)를 뺀다.
					answer -= attacks[i][1];
					count = 0;
					i++;
					if (answer <= 0) {
						answer = -1;
                        i = attacks.length;
                        k = finalAttack;
                    }
				}

				// 붕대 감기
				// 몬스터의 공격이 없는 시간 동안
				else {
					if (answer < health) {
						// 초당 붕대 감기를 시작하는데, 회복 k 상승마다 가능.
						count++;
						answer += bandage[1];

						if (count == bandage[0]) {
							answer += bandage[2];
							count = 0;
						}
					}
					if (answer >= health) {
						answer = health;
						count = 0;
					}
				}

				k++;
			}
		}

		return answer;

	}
}