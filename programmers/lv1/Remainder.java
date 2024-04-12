public class Remainder{
    public static void main(String[] args) {
        Remainder remainder = new Remainder();
        System.out.println(remainder.solution(1, 2));
        
    }
    
    public int solution(int num1, int num2){
        
        int answer = num1%num2;
        return answer;
    }
}