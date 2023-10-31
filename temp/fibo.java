public class fibo {
    public static void main(String[] args) {
        
        // 재귀함수 이해하기
        System.out.println(sum(3));
        
        for(int i = 0; i < 10; i++)
        System.out.println(fibo(i));

        
    }

    // 1~n까지의 합
    static int sum(int n){
        
        if(n == 0) return 0;

        return n += sum(n-1);
    }
    
    // n까지의 피보나치 수열
    static int fibo(int n){
        
        if(n == 0) return 0;
        if(n == 1 || n == 2 ) return 1;

        return fibo(n-1) + fibo(n-2);
    }
    
}
