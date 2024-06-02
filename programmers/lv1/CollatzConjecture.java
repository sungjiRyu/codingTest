public class CollatzConjecture {
    // 콜라츠 추측
    // 2024-06-03
    public static int solution(long num) {
        int cnt = 0;

        while (num != 1) {
            if (cnt >= 500) return -1;

            if  (num % 2 == 0)  num = num / 2;
            else num = num * 3 + 1;

            cnt ++;
        }

        return cnt;
    }

    // test case 중 626331의 값은 -1이 나와야 하지만 실행해보니 488이 나왔음
    // -> 연산과정에서 num의 값이 21억을 넘어가기때문에 overflow가 나서 계산이 뒤틀리는거였음.
    // -> int num => long num 으로 바꿔서 해결
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
