public class Pizza1{
    public static void main(String[] args) {
        Pizza1 pizza = new Pizza1();
        
        System.out.println(pizza.solution(21));
        
    }
    public int solution(int n) {
    
        int answer = 0;
        
        if(n == 0)  answer = 0;
        else if(n%7 == 0) answer = n/7;
        else answer = (n/7) + 1;
        
        return answer;
        
    }
    
}