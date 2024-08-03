import java.util.Arrays;

public class KthNumber {
//    2024-08-03
//    k번째수
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] cutArray;

        for (int i = 0; i < commands.length; i++) {
            if (commands[i][0] == 0)
                cutArray = Arrays.copyOfRange(array, 0, commands[i][1] - 1);
            else
                cutArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

            Arrays.sort(cutArray);

            answer[i] = cutArray[commands[i][2] - 1];
        }

        return answer;
    }
}
