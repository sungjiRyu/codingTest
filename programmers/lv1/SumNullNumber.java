public class SumNullNumber {
    // 없는 숫자 더하기
    // 2024-06-01
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++){
            answer += numbers[i];
        }

        return 45 - answer;
    }
}
