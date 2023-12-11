public class temp {

        public static void main(String[] args) {
            int answer = 1;
            int n = 20;

            // 서로 다른 구슬을 선택하는 경우의 수
            for(int i = 1; i <= n; i++){
            answer *= i;
            }


            System.out.println(factorial(5));
        }

        public static int solution(int balls, int share) {
            //조합(combination)
            int answer = 0;
          
            answer = factorial(balls)/(factorial(balls-share)*factorial(share));

            return answer;
        }
        
        public static int factorial(int n){
            if(n==0){ 
            return 1;
            }
            return n*factorial(n-1);
        }
    }
