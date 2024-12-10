public class Repainting {
    // 덧칠하기
    // 2024-12-10
    public static void main(String[] args) {
        int[] array = {1, 4, 5};
        System.out.println(solution(5,2, array));
    }
    public static int solution(int n, int m, int[] section) {

        int answer = 0;

        // 모든 구역을 확인
        for (int i = 1; i <= n; i++) {
            for (int j : section) {
                // 페인트를 칠해야하는 구역이면 페인트를 칠한 후 칠하지 않은 다음 구역까지 이동
                if (i == j) {
                    i += m;
                    answer++;
                }
            }
        }

        return answer;
    }
}
