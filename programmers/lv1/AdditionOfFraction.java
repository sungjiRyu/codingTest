    import java.util.Arrays;

    public class AdditionOfFraction {
        public static void main(String[] args) {
            AdditionOfFraction addFraction = new AdditionOfFraction();

            int[] solution = addFraction.solution(1, 2, 1, 3);

            System.out.println(Arrays.toString(solution));
            // for(int i = 0; i < solution.length; i++){
            // System.out.println(solution[i]);
            // }

        }


        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int[] answer = new int[2];
            
            int numer = (numer1*denom2) + (numer2*denom1);
            int denom = denom1 * denom2;
            
            for(int i = numer-1; i>0; i--)
            {
                if(numer % i == 0 && denom % i == 0){
                    numer /= i;
                    denom /= i;
                    }
            }
            
            answer[0] = numer;
            answer[1] = denom;
            
            return answer;
        }

    }
        // 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
        //  두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    //     int[] solution(int numer1, int denom1, int numer2, int denom2) {
            
    //         // 분자와 분모 계산
    //         int numerator   = (numer1 * denom2) + (numer2 * denom1);
    //         int denominator = denom1 * denom2;

    //         // 기약분수가 될때까지
    //         for(int i = numerator-1; i>1 ; i--){ 
    //             if(numerator % i == 0 && denominator % i == 0){ // 분모와 분자의 나머지가 0이라면(나누어 떨어짐)
    //                 numerator /= i;
    //                 denominator /= i;
    //             }   
    //         }

    //         int []answer = {numerator, denominator};
    //         return answer;
    //     }
    // }

        