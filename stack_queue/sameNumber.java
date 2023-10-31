import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sameNumber{
    public static void main(String[] args) {
       sameNumber sameNumber = new sameNumber();

       int arr[] = {1,1,2,2,3,3,4,4,5,5};
       int answer[] = sameNumber.solution(arr);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(Arrays.toString(answer));

    }
    
    public int[] solution(int arr[]){
         ArrayList<Integer> answerList = new ArrayList<Integer>();
        int value = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != value){
                value = arr[i];
                answerList.add(arr[i]);
            }
        }

        return answerList.stream()
        .mapToInt(Integer::intValue)
        .toArray();

    }
    
   
}