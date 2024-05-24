import java.util.Arrays;

public class DescInteger {
    // 정수 내림차순으로 배치하기
    // 2024-05-24
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String str : list) sb.append(str);

        return Long.parseLong(sb.reverse().toString());
    }
}
