public class DuplicateNumber {
    // 프로그래머스 lv0 중복된 숫자 개수
    // 2024-04-29
    public int solution(int[] array, int n) {
        int answer = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] == n){
                answer ++;
            }
        }
        return answer;
    }
}
