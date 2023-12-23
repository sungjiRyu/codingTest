import java.util.HashSet;

public class Pokemon {
    public int solution(int[] nums){
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();
        int max = nums.length/2;

        // set으로 중복제거
        for(int num : nums){
            set.add(num);
        }
        // set.size(포켓몬의 종류) 와 max(고를 수 있는 마릿수) 중 최솟값이 정답
        if(set.size() < max )  return set.size();
        else return max;
    }
}
