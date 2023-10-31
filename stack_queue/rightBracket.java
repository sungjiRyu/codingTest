import java.util.Stack;

public class rightBracket{
    public static void main(String[] args) {
        rightBracket rightBracket = new rightBracket();
        
        
        System.out.println(rightBracket.solution2(")()("));
    }

    boolean solution(String s){
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        // stakc에 문자열의 내용을 저장, 하나씩 비교
        // 
        for(char item : s.toCharArray()){
            if(item == '(')           stack.push('(');
            else{
                if(stack.isEmpty())   return false;
                else                  stack.pop();
                }
        }
        return stack.isEmpty()?true : false;
    }

    boolean solution2(String s) {
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
            }
            if (openCount < closeCount) {
                return false;
            }
        }
        if (openCount == closeCount) {
            return true;
        }
        return false;
    }
}