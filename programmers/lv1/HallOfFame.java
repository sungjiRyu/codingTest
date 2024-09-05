import java.util.*;

public class HallOfFame {
    // 명예의 전당(1)
    // 2024-09-05

    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;
        System.out.println(Arrays.toString(solution2(k, score)));
    }
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (i + 1 <= k) {
                hallOfFame.add(score[i]);
            } else {
                hallOfFame.set(hallOfFame.indexOf(Collections.min(hallOfFame)), Math.max(score[i], Collections.min(hallOfFame)));
            }
            answer[i] = Collections.min(hallOfFame);
        }

        return answer;
    }

    // 다른사람코드 참고(우선순위 큐 사용)
    public static int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);

            if(pq.size() > k){
                pq.poll();
            }
            answer[i] = pq.peek();
        }

        return answer;
    }
 }
