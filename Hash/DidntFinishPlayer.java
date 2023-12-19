import java.util.Arrays;

// 프로그래머스 LV1 완주하지 못한 선수
public class DidntFinishPlayer {
    
    //participant = 마라톤에 참여한 선수들의 이름이 담긴 배열 
    //completion = 완주한 선수들의 이름이 담긴 배열
    public String solution(String[] participant, String[] completion) {
        // completion의 길이는 participant의 길이보다 1 작습니다.
        // 완주하지 못한 선수의 이름을 return
        String answer = "";
        
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < participant.length; i++ ){
            if(!participant[i].equals(completion[i]))
            return answer = participant[i];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        DidntFinishPlayer sol = new DidntFinishPlayer();
        
        String[] participant = {"leo","kiki","edan","kiki"};
        String[] completion = {"leo","edan","kiki"};
    
        System.out.println(sol.solution(participant, completion));
    }
}

