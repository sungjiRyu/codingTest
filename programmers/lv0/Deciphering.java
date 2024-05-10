public class Deciphering {
    public String solution(String cipher, int code) {
        // 암호해독
        // 2024-05-10
        String answer = "";

        for(int i = code; i <= cipher.length(); i += code){
            answer += cipher.charAt(i-1);
        }

        return answer;
    }
}
