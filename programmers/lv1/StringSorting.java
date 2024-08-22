import java.util.ArrayList;
import java.util.Collections;

public class StringSorting {
//    2024-08-22
//    문자열 내 마음대로 정렬하기
    public String[] solution(String[] strings, int n) {
        String temp = "";

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - 1; j++) {
                if (strings[j].charAt(n) > strings[j+1].charAt(n)) {
                    temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
                // n번째 문자가 같을 경우 사전순으로 정렬
                else if (strings[j].charAt(n) == strings[j + 1].charAt(n)){
                    int min = Math.min(strings[j].length(), strings[j+1].length());
                    for (int k = 0; k < min; k++) {
                        if (strings[j].charAt(k) > strings[j + 1].charAt(k)) {
                            temp = strings[j];
                            strings[j] = strings[j + 1];
                            strings[j + 1] = temp;
                            break;
                        }
                        else if (strings[j].charAt(k) < strings[j + 1].charAt(k)) {
                            break;
                        }
                        int compare = Integer.compare(strings[j].length(), strings[j+1].length());
                        if (compare < 0) {
                            temp = strings[j];
                            strings[j] = strings[j + 1];
                            strings[j + 1] = temp;
                        }
                    }
                }
            }
        }
        return strings;
    }

    // 다른사람의 풀이
    // n번째 char을 기존문자열의 맨앞에 붙이는게 포인트
    public String[] solution2(String[] strings, int n) {

        StringBuffer[] strBuf = new StringBuffer[strings.length];

        for (int i = 0; i < strings.length; i++) {
            strBuf[i] = new StringBuffer(strings[i]);
        }

        ArrayList<StringBuffer> list = new ArrayList<>();
        for (StringBuffer string : strBuf) {
            list.add(string.insert(0,string.charAt(n)));
        }

        Collections.sort(list);

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }
}
