public class NumberAndSumOfDivisors {
    // 약수의 갯수와 합
    // 2024-06-12
    public static int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;


        for (int i = left; i <= right; i++) {
            for ( int j = 1; j <= i; j++){
                if(i%j == 0) cnt++;
            }
            answer += cnt % 2 == 0 ? i : i * -1;
            cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(24,27));
    }

}
