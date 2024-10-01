public class KnightsWeapon {
    // 2024-09-25
    // 기사단원의 무기
    public static int solution(int number, int limit, int power) {
        // number : 기사의 수 (기사의 수가 5 이면 1번~5번의 총 5명의 기사가 존재)
        // limit : 공격력 제한수치
        // power : 공격력 제한수치를 넘길경우 사용해야 하는 무기의 공격력
        int answer = 0;
        int[] weapon = new int[number];
        int cnt = 0;


        // 1. 각번호의 기사마다 약수의 갯수를 구함(약수 갯수의 합 = 무기공격력)
        for (int i = 1; i <= number; i++) {
                // 약수를 구함 i = 기사번호
                for (int j = 1; j*j <= i; j++) {
                    if ( i % j == 0){
                        cnt++;
                        if (j != i / j) {
                            cnt ++;
                        }
                    }
                }
                weapon[i-1] = cnt;
                cnt = 0;
        }
        // 2. 제한수치를 넘긴 공격력 power로 셋팅
        // 3. 모든 기사의 무기 공격력을 더함(철의 무게)
        for (int i : weapon) {
            if (i > limit) {
                answer += power;
            } else {
                answer += i;
            }
        }

        return answer;
    }

    // 다른 사람의 풀이(약수를 저렇게도 구하는구나..)
    public static int solution2(int number, int limit, int power) {
        int[] count = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution2(5, 3, 2));
    }

}
