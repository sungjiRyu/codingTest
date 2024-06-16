public class StringHandling {
    // 문자열 다루기 기본
    // 2024-06-16
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4 || s.length() != 6){
            return s.matches("^[0-9]+$");
        }
        return false;



    }
}
