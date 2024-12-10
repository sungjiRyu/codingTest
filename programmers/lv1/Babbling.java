public class Babbling {
    // 옹알이(2)
    // 2024-12-10
    public static void main(String[] args) {
        String[] sample = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(sample));
    }
    public static int solution(String[] babbling) {

        String[] validWords = {"aya", "ye", "woo", "ma"};
        String[] invalidWords = {"ayaaya", "yeye", "woowoo", "mama"};
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {

            boolean isAvailable = false;

            for (String invalidWord : invalidWords) {
                if(babbling[i].contains(invalidWord)){
                    isAvailable = true;
                    break;
                }
            }

            if(isAvailable) continue;

            for (String s : validWords) {
                babbling[i] = babbling[i].replace(s, " ");
            }

            if (babbling[i].isBlank()) {
                answer++;
            }
        }

        return answer;
    }
}
