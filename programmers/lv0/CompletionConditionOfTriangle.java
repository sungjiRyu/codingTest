import java.util.Arrays;

public class CompletionConditionOfTriangle {
    // 삼각형의 완성조건(1)
    // 2024-05-06

    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        if(sides[2] < sides[1] + sides[0]){
            return answer = 1;
        }

        else {
            return answer = 2;
        }
    }
}
