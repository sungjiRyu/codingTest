public class MinumRectangle {
    // 최소직사각형
    // 2024-07-30
    public static void main(String[] args) {
        int[][] sizes = {{60, 50},{30, 70},{60, 30},{80, 40}};
        System.out.println(solution(sizes));
    }

    // 1. 최댓값을 구한다(가로)
    // 2. 각 명함별 최솟값 중 가장 큰 값을 구한다(세로)
    // 3. 둘을 곱한다(가로 * 세로)
    // 4. 어렵다..
    public static int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for (int[] size : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);

            if (max > width) {
                width = max;
            }
            if (min > height) {
                height = min;
            }
        }

        return width * height;

    }
}
