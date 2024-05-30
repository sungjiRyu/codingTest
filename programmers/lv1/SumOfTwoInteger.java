public class SumOfTwoInteger {
    // 두 정수 사이의 합
    // 2024-05-30
    public long solution(int a, int b) {
        long answer = 0;

        if( a < b){
            for (int i = a; i <= b; i++) {
                answer += i;
            }
            return answer;
        }

        else if( a > b){
            for (int i = b; i <= a; i++) {
                answer += i;
            }
            return answer;
        }

        else return answer = a;
    }
}
