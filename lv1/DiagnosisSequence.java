import java.util.Arrays;

class DiagnosisSequence {
    // 진료 순서 정하기
    // 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
    // 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

    // 중복된 원소는 없습니다.
    // 1 ≤ emergency의 길이 ≤ 10
    // 1 ≤ emergency의 원소 ≤ 100
    public static void main(String[] args) {
        int [] emergency = {10,5,1,2,3,7,6,9};
        Arrays.sort(emergency);

        for(int num : emergency)
        System.out.println(num);

        System.out.println(Arrays.toString(solution(emergency)));
    }
    public static int[] solution(int[] emergency) {
        int[] answer = {};

        for(int i = 0; i < emergency.length; i++){
            for(int j = 1; j <= emergency.length-1; j++){
                if(emergency[j] > emergency[j]-1){
                    emergency[j-1] = emergency[j];
                    emergency[j] = emergency[j-1];
                }
            }
        }
        answer = emergency;
            

        return answer;
    }
}