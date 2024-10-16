import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MockExam {
    // 2024-10-13
    // 모의고사
    public static void main(String[] args) {
        int[] input = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(input)));
    }
    public static int[] solution(int[] answers) {

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (person1[i % person1.length] == answers[i]) {
                score[0] ++;
            }
            if (person2[i % person2.length] == answers[i]) {
                score[1] ++;
            }
            if (person3[i % person3.length] == answers[i]) {
                score[2] ++;
            }
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> arrayAnswer = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                arrayAnswer.add(i+1);
            }
        }

        Collections.sort(arrayAnswer);

        int[] answer = new int[arrayAnswer.size()];

        for (int i = 0; i < arrayAnswer.size(); i++ ) {
            answer[i] = arrayAnswer.get(i);
        }

        return answer;
    }
}
