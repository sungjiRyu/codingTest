public class NNumbersSpacedByX {
    // x만큼 간격이 있는 n개의 숫자
    // 2024-05-28
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0L;

        for (int i = 0; i < n; i++) {
            sum += x;
            answer[i] = sum;
        }

        return answer;
    }
}
