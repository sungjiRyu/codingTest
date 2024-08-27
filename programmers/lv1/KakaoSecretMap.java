import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

public class KakaoSecretMap {
    // 2024-08-28
    // 비밀지도

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer  = new String[n];
        String[] arr1Str = new String[n];
        String[] arr2Str = new String[n];
        int binary = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1Str[i] = toBinary(arr1[i], n);
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2Str[i] = toBinary(arr2[i], n);
        }

        Arrays.fill(answer, "");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1Str[i].charAt(j) == '1' || arr2Str[i].charAt(j) == '1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }

        return answer;
    }

    // 각 배열의 원소를 이진수로 변환
    public static String toBinary (int decimal, int n){

        long binary = (long) Math.pow(10, n);
        long i = 1;

        while (decimal > 0) {
            binary += i * (decimal % 2);
            decimal = decimal / 2;

            i *= 10;
        }

        return String.valueOf(binary).substring(1);
    }
}

