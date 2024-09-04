public class Cola {
    // 콜라 문제
    // 2024-09-04
    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
    }
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int exchange = (n / a) * b; // 교환할 수 있는 콜라 병 수
            answer += exchange;         // 총 콜라 병 수에 더하기
            n = (n % a) + exchange;     // 남은 병 + 새로 받은 병 수
        }

        return answer;
    }
}
