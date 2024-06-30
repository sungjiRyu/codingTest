import java.lang.reflect.Array;
import java.util.*;

public class RemoveSmallestNum {
    // 제일 작은 수 제거하기
    // 2024-06-30
    public static int[] solution(int[] arr) {
        // 배열의 원소가 하나밖에 없을 경우
        if(arr.length == 1) return new int[]{-1};
        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        // 제일 작은 수 구하기
        for (int i : arr) {
            if (i < min){
                min = i;
            }
        }

        // 제일 작은 수를 제외한 배열을 만듬
        int index = 0;
        for (int i : arr) {
            if (i != min) {
                answer[index] = i;
                index ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

}
