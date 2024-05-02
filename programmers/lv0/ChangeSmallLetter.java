import java.util.Locale;

public class ChangeSmallLetter {
    // 프로그래머스 코딩 기초 트레이닝
    // 소문자로 바꾸기
    // 2024-05-02
    public static void main(String[] args) {
        char a = 'Z';
        int num = 0;

        ChangeSmallLetter changeSmallLetter = new ChangeSmallLetter();

        System.out.println(changeSmallLetter.solution("ABCD"));
        System.out.println((char)97);
    }
    public String solution(String myString) {
    // A = 65 a = 97
        String answer = "";
        char lowercase;
        int num = 32;

        myString.toLowerCase();

        char[] alpabet = myString.toCharArray();

        for(int i = 0; i < alpabet.length; i++){

            if((int)alpabet[i] >= 65 && (int)alpabet[i] <= 90 ) {
                answer += (char) (alpabet[i] + num);
            }
            else{
                answer += alpabet[i];
            }

        }

        return answer;
    }
}
