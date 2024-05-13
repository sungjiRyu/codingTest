public class LetterCase {

    // 대문자와 소문자
    // 2024-05-13
    public static void main(String[] args) {
        char chr = 'Z';
        System.out.println((int)chr);
    }
    public  String solution(String my_string) {
        String answer = "";
        answer.toLowerCase();

        // 대문자 -> 소문자로
        // 소문자는 -> 대문자로
        // 'a' = 97 , 'A' = 65

        for(int i = 0; i < my_string.length(); i++){
            int alphabet = (int)my_string.charAt(i);
            if(alphabet <= 90){
                answer += (char)(alphabet + 32);
            }
            else {
                answer += (char)(alphabet - 32);
            }
        }
        return answer;
    }
}
