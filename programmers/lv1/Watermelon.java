public class Watermelon {
    // 수박수박수박수박수박수?
    // 2024-06-09
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if(i == 0 || i%2 !=0)
                answer.append('수');
            else
                answer.append('박');
        }
        return answer.toString();
    }
}
