public class SquareRoot {
    //    2024-05-25
    // 정수 제곱근 판별
    public long solution(long n) {
        long answer = 0;

        double sqrt = Math.sqrt(n);

        if(sqrt % 1 == 0) {
            answer = (long) Math.pow(sqrt + 1, 2);
        }
        else answer = -1;

        return answer;
    }
}
