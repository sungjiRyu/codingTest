import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SumOfDivisors {
    // 약수의 합
    // 2024-05-22
    public static void main(String[] args) {
        int answer = solution(5);
        System.out.println(answer);
    }
    public static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                answer += i;
            }
        }

        return answer;
    }
}
