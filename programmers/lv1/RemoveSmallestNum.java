import java.util.Arrays;

public class RemoveSmallestNum {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        if (arr.length > 1){
            for (int i = 0; i < arr.length - 1; i++) {
                if (i < arr.length - 1) {
                    if (arr[i] < arr[i + 1]) {
                        arr[i + 1] = arr[i];
                    }
                } else if (i == arr.length - 1) {
                    if (arr[i] < arr[i + 1]) {
                        answer[i] = arr[i];
                    }
                }
            }
        }
        else {
            answer[0] = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] answer = solution(arr);
        System.out.println("arr = " + Arrays.toString(answer));
    }
}
