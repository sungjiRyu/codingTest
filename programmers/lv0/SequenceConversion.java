public class SequenceConversion {
    // 2024-05-19
    // 조건에 맞게 수열 변환하기 1
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int i = 0;

        for (int num : arr) {
            if(num>=50 && num%2 == 0){
                answer[i] = num/2;
            }
            else if(num<50 && num%2 != 0){
                answer[i] = num*2;
            }
            else{
                answer[i] = num;
            }
            i++;
        }

        return answer;
    }
    // * answer 을 빼고 arr을 바로 리턴한다면 else 조건이 없어도 됨
}
