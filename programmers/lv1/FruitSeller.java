import java.util.Arrays;

public class FruitSeller {
    // 2024-11-04
    // 과일장수
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }

        return answer;
    }

}
