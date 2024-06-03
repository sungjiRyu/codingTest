import java.util.Arrays;

public class ArrayOfDivisibles {
    // 나누어 떨어지는 숫자 배열
    // 2024-06-03

    public static void main(String[] args) {

        int[] arr = {3, 2, 6};
        int divisor = 10;

        int[] answer = solution(arr, divisor);
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
    public static int[] solution(int[] arr, int divisor) {
        int index = 0;
        int cnt = 0;

        // 값을 담을 배열의 길이를 구함
        for (int i : arr) {
            if(i%divisor == 0) cnt++;
        }

        if (cnt == 0) cnt = 1;

        int[] answer = new int[cnt];
        // 나누어 떨어진다면 배열에 담아줌
        for (int i : arr) {
            if(i%divisor == 0) {
                answer[index] = i;
                index++;
            }
        }

        if (index == 0) answer[0] = -1;

        // 오름차순 정렬
        Arrays.sort(answer);


        return answer;
    }
}
