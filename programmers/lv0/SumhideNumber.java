public class SumhideNumber {
    // 숨어있는 숫자의 덧셈(1)
    // 2024-05-03
    public int solution(String my_string) {
        int answer = 0;
        int i = 0;

        String[] arr = my_string.replaceAll("[^0-9]", "").split("");
        for(String str : arr) {
            answer += Integer.parseInt(arr[i]);
            i++;
        }
        return answer;
    }
}
