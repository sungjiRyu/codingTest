public class NumberStringAndWords {
//    204-08-04
//    숫자 문자열과 영단어
    public int solution(String s) {

        String[] word =  {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < word.length; i++) {
            s = s.replaceAll(word[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}

