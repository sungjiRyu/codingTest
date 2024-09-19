import java.util.*;

public class DeckOfCards {
    // 2024-09-19
    // 카드 뭉치
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        Queue<String> q1 = new LinkedList<String>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<String>(Arrays.asList(cards2));

        for (String s : goal) {
            if (q1.size() > 0 && q1.peek().equals(s)) {
                q1.remove();
            } else if (q2.size() > 0 && q2.peek().equals(s)) {
                q2.remove();
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}

