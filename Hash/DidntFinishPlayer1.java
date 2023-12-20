import java.util.Arrays;
import java.util.HashMap;

// 프로그래머스 LV1 완주하지 못한 선수
public class DidntFinishPlayer1 {
    
    //participant = 마라톤에 참여한 선수들의 이름이 담긴 배열 
    //completion = 완주한 선수들의 이름이 담긴 배열
    public String solution(String[] participant, String[] completion) {
        // completion의 길이는 participant의 길이보다 1 작습니다.
        // 완주하지 못한 선수의 이름을 return
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 명단을 map에 넣는다.
        for(String name : participant){
            map.put(name, map.getOrDefault(name,0)+1);
        }

        // 완주자 명단을 map에서 뺀다.
        for(String name : completion){
            map.put(name, map.get(name)-1);
        }

        // value 가 0이 아니면 완주하지 못한 선수
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        DidntFinishPlayer sol = new DidntFinishPlayer();
        
        String[] participant = {"leo","edan","kiki","james", "leo"};
        String[] completion = {"leo","edan","kiki", "james"};
    
        System.out.println(sol.solution(participant, completion));

}


}
