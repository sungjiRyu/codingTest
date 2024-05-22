public class SumOfDigits {
    // 자릿수 더하기
    // 2024-05-22
        public int solution(int n) {
            int answer = 0;

            while(n > 0){
                answer += n%10;
                n = n/10;
            }
            return answer;
        }
}
