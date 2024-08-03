import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

        solution(array, commands);
        System.out.println(Arrays.toString(solution(array, commands)));

    }
//    2024-08-03
//    k번째수
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] cutArray;
        int result = 0;

        for (int i = 0; i < commands.length; i++) {
            // 배열을 생성하고 정렬
            if (commands[i][0] == 0)
                cutArray = Arrays.copyOfRange(array, 0, commands[i][1] - 1);
            else
                cutArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(cutArray);

            result = commands[i][2] == 1 ? cutArray[0] : cutArray[commands[i][2] - 1];

//            System.out.println(Arrays.toString(cutArray));
            answer[i] = result;
        }

        return answer;
    }
}
