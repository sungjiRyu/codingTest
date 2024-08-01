import java.util.HashMap;

public class ClosestLetter {
    // 2024-08-01
    // 가장 가까운 같은 글자
    public static void main(String[] args) {
        String str = "apple";
    }
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char ch = 'a';

        // HashMap에 <문자, 인덱스> 로 저장
        HashMap<Character, Integer> map = new HashMap();

        // 문자열을 순회하여 각 문자에 대해 가까운 인덱스를 찾음(HahsMap은 중복키를 저장할 경우 append 함)
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            answer[i] = i - map.getOrDefault(ch, i + 1);
            map.put(ch, i);
        }
        return answer;
    }
}
