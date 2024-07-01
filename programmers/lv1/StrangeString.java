public class StrangeString {
    // 이상한 문자 만들기
    // 2024-07-01
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] str = s.split(" ", -1);

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                // 짝수 홀수 구분
                if (j%2 == 0){
                    answer.append(Character.toUpperCase(str[i].charAt(j)));
                } else {
                    answer.append(Character.toLowerCase(str[i].charAt(j)));
                }
            }
            if (i == str.length - 1) break;
            answer.append(" ");
        }

        return answer.toString();
    }

    // 다른사람것 참고해서 만든 코드
    // 이게 더 깔끔한듯 ( 굳이 split 쓸 이유가 없었다 )
    public String solution2(String s) {
        char[] chars = s.toCharArray();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if ( chars[i] == ' ')
                index = 0;
            else
                chars[i] = index++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);

        }

        return String.valueOf(chars);
    }
}
