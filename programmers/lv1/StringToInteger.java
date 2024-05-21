public class StringToInteger {
    // 문자열을 정수로 바꾸기
    // 2024-05-21
    public static void main(String[] args) {
     int answer = solution2("1234");
        System.out.println(answer);
    }
    public int solution(String s) {
        int answer = 0;
        return answer = Integer.parseInt(s);
    }

    // parseInt 쓰지 않는 경우
    public static int solution2(String s){
        int answer = 0;
        boolean sign = true;

        for(int i = 0; i<s.length(); i++){
            char chr = s.charAt(i);
            if(chr == '-')
                sign = false;
            else if(chr != '+')
                answer = answer * 10 + (chr - '0');
        }
        return sign? answer : -answer;
    }
}
