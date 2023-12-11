import java.util.Arrays;

public class DiagnosisSequence{
    public static void main(String[] args) {

        

        int [] emergency = {3,76,24};
        int [] answer = solution(emergency);
    System.out.println(Arrays.toString(answer));
       
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int num = 1;

        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    num++;
                }
                answer[i] = num;
            }
            num = 1;
        }

        return answer;
    }
}