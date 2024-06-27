import java.util.Arrays;

public class Budget {
    // 예산
    // 2024-06-27
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        // 1. 배열을 오름차순으로 정렬한다.
        // 2. 하나씩 더한다.
        // 3. 주어진 예산을 초과한다면 return
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) return i;
        }
        return d.length;
    }
}
