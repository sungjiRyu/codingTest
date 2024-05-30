public class Kimseobang {
    // 2024-05-30
    // 서울에서 김서방 찾기
    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;

        for (String s : seoul) {
            if(s.equalsIgnoreCase("kim")) return "김서방은 "+index+"에 있다";
            index++;
        }
        return answer;
    }
}
