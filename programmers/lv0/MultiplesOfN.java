public class MultiplesOfN {
    // n의 배수 고르기
    // 2024-05-16
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int index = 0;
        int count = 0;

        for(int i = 0; i<numlist.length; i++){
            if(numlist[i]%n == 0) {
                count ++;
            }
        }

        answer = new int[count];

        for(int i = 0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                answer[index] = numlist[i];
                index ++;
            }
        }
        return answer;
    }
}
