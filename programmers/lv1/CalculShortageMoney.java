public class CalculShortageMoney {
    // 부족한 금액 채우기
    // 2024-06-14
    public long solution(int price, int money, int count) {
        long answer = 0L;

        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }

        answer = money - answer;

        return answer > 0 ? 0 : answer * -1;
    }

    // 새로 배운 풀이
    // 등차수열의 합 n(a + l)/2  공식을 이요하면 깔끔
    // ** n = 항의 개수, a = 첫항, l = 마지막 항
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
