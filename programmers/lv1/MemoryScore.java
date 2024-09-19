import java.util.HashMap;
import java.util.Map;

public class MemoryScore {
    // 2024-09-19
    // 추억 점수
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int score = 0;

        Map<String, Integer> nameAndYearning = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            nameAndYearning.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (nameAndYearning.get(photo[i][j]) != null) {
                    score += nameAndYearning.get(photo[i][j]);
                }
            }
            answer[i] = score;
        }

        return answer;
    }
}
