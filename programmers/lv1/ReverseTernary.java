public class ReverseTernary {
    // 3진법 뒤집기
    // 2024-06-19
    public int solution(int n) {
        StringBuilder str = new StringBuilder();
        int answer = 0;
        // 자연수n -> 3진수(역순)
        while ( n > 0) {
            str.append(n % 3);
            n = n / 3;
        }

        // 3진수(역순) -> 10진수
        str.reverse();
        for (int i = 0; i < str.length(); i++) {
            double pow = Math.pow(3, i);
            answer += Integer.parseInt(String.valueOf(str.charAt(i))) * pow;

        }

        return answer;
    }
    // 알게된 사실
    // parsInt에는 진수변환기능이 있다.... praseInt(a, 3) a => 3진법으로 변환
}
