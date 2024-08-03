import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SelectTwoSum {
    // 2024-08-04
    // 두개 뽑아서 더하기
    public int[] solution(int[] numbers) {
        // * 서로다른 두개를 뽑아 더해서 만들 수 있는 모든 수
        // 1. 서로다른 두개를 뽑는 경우의 수를 구함.
        // 2. 뽑은 수를 더해서 HashSet에 저장(set 은 중복을 허용하지 않는다(가장 최근에 들어온 중복 값 무시))
        // 3. 베열에 담아 오름차순으로 정렬한다.
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> list = new ArrayList<>(set);
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
