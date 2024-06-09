public class BringMiddleText {
    // 가운데 글자 가져오기
    // 2024-06-09
    public String solution(String s) {
        String answer = "";
        StringBuilder str = new StringBuilder();

        int length = s.length();

        if (length%2 == 0) {
            str.append(s.charAt(length/2-1));
            str.append(s.charAt(length/2));
        } else {
            str.append(s.charAt(length/2));
        }

        answer = str.toString();

        return answer;
    }
}
