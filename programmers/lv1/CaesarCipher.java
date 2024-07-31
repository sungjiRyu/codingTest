public class CaesarCipher {
    // 2024-07-31
    // 시저암호
    public static void main(String[] args) {

        String arg = "z";
        int n = 25;
        System.out.println(solution(arg, n));


    }

    // 포인트는 26 으로 나누는것
    public static String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                // 소문자 처리
                char shifted = (char) ((c - 'a' + n) % 26 + 'a');
                result.append(shifted);
            } else if (c >= 'A' && c <= 'Z') {
                // 대문자 처리
                char shifted = (char) ((c - 'A' + n) % 26 + 'A');
                result.append(shifted);
            } else {
                // 공백 및 기타 문자는 그대로 유지
                result.append(c);
            }
        }

        return result.toString();
    }

}
