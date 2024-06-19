public class SmallSubstring {
    // 크기가 작은 부분문자열
    // 2024-06-19

    // 처음엔 if 문 안의 조건을 int로 비교했더니 런타임 에러가 발생했다.
    // 제한사항의 1 ≤ p의 길이 ≤ 18 조건때문이었다 ..!
    // p의 길이가 int의 범위(10자리)를 넘어서기 때문에 런타임 에러가 난다...
    // 때문에 Long 타입으로 바꿔서 해결
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        String substr = "";

        for (int i = 0; i <= tLength - pLength; i++) {
            substr = t.substring(i, i+pLength);
            if (Long.parseLong(substr) <= Long.parseLong(p)) {
                answer ++;
            }
        }
        return answer;
    }

}

