public class GreatestCommonDivisorAndLeastCommonMultiple {
    // 최대공약수와 최소공배수
    // 2024-06-19
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int r = 0;
        int max = Math.max(n, m);

        for (int i = 1; i <= max; i++) {
            if(n%i == 0 && m%i == 0) answer[0] = i;
        }

        for (int i = 1; i <= n * m; i++) {
            if(i%n == 0 && i%m == 0) {
                answer[1] = i;
                break;
            }
        }

        return answer;
    }
}
