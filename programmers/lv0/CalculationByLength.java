public class CalculationByLength {
    // 2024-05-19
    // 길이에 따른 연산
    public int solution(int[] num_list) {
//        int answer = 0;
        int answer = (num_list.length > 10 ? 0 : 1);
        int lenght = num_list.length;

        if(lenght > 10){
            for (int i : num_list) {
                answer += i;
            }
        }
        else {
//                answer = 1;
            for (int i : num_list) {
                answer *= i;
            }
        }

        return answer;
    }
    // * 새로알게된 사실
    // answer 변수에 삼항연산자를 사용하면 answer = 1 로 초기화해줄 필요가 없다.
    // int answer = (num_list.length > 10 ? 0 : 1)
}
