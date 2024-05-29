public class OneReminder {
    // 나머지가 1이 되는 수 찾기
    // 2024-05-29
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if(n%i == 1) return answer = i;
        }

        return answer;
    }
}
