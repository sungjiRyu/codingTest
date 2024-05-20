public class NumberOfPAndI {
    // 문자열 내 p와 y의 개수
    // 2024-05-21
    boolean solution(String s) {
        boolean answer = true;
        char chr = 'A';
        int cntP = 0;
        int cntY = 0;

        for(int i=0; i<s.length(); i++){
            chr = s.charAt(i);
            if(Character.toUpperCase(chr) == 'P'){
                cntP ++;
            }
            else if(Character.toUpperCase(chr) == 'Y'){
                cntY ++;
            }
        }

        if(cntP == cntY) {
            answer = true;
        }
        else if(cntP != cntY) {
            answer = false;
        }
        else {
            answer = true;
        }

        return answer;
    }

    // 새로 배운 코드(남이 한 코드)
    boolean solution2(String s){
        boolean answer = true;
        s = s.toLowerCase();
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                count ++;
            }
            else if(s.charAt(i) == 'y'){
                count --;
            }
        }
            answer = count == 0;
            return answer;
    }
}
