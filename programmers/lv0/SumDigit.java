public class SumDigit {
    // 자릿수 더하기
    // 2024-05-16
    public static void main(String[] args) {
        int answer = 0;

        String str = String.valueOf(1234);

        char[] temp = str.toCharArray();

        for(int i = 0; i < temp.length; i++){
            answer += Integer.valueOf(temp[i])-48;
        }
        System.out.println(answer);
    }

    // 내가한 풀이
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);

        char[] temp = str.toCharArray();

        for(int i = 0; i < temp.length; i++){
            answer += Integer.valueOf(temp[i])-48;
        }

        return answer;
    }

    // 새로 알게된 풀이
    public int newSolution(int n) {
        int answer = 0;

        while(n>0){
            // answer에 나머지를 계속 더해준다.
            answer += n%10;
            // 나머지를 더하면 자릿수를 줄여서 반복
            n /= 10;
        }

        return answer;
    }
}
