import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class DescendingString {
    // 문자열 내림차순 배치
    // 2024-06-13
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        char[] chr = s.toCharArray();
        Arrays.sort(chr);

        for ( int i = chr.length - 1; i >= 0 ; i--){
            answer.append(chr[i]);
        }

        return answer.toString();
    }
}
