import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodFighter {
    // 2024-08-06
    // 푸드 파이트 대회
    public String solution(int[] food) {
        int q = 0;
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= food.length - 1; i++) {
            q = food[i] / 2;
            for ( int j = 0; j < q; j++){
                answer.append(i);
            }
        }

        answer.append(0);

        for (int i = food.length - 1; i > 0; i--) {
            q = food[i] / 2;
            for ( int j = 0; j < q; j++){
                answer.append(i);
            }
        }

        return answer.toString();
    }
}
