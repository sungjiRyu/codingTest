public class AddBiggerThanN {
    // n보다 커질 때까지 더하기
    // 2024-05-20
    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int num : numbers) {
            answer += num;
            if(answer > n) return answer;
        }
        return answer;
    }
}
