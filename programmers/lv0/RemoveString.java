// 23/11/07
public class RemoveString {
    // 특정 문자 제거하기
    // 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
    // my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        System.out.println(solution("abcd", "a"));
        
    }

    
    
    static String solution(String my_string, String letter) {
        String answer = "";
        // 배운점 : replace를 쓰면 간단하다.
        // answer = my_string.replace(letter, "");
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) != letter.charAt(0)){
                answer = answer + my_string.charAt(i);
            }
        }            

        return answer;
    }
}
