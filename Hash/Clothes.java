import java.util.HashMap;
import java.util.Iterator;


public class Clothes {

        public static void main(String[] args) {
            String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

            // System.out.println(clothes[1][1]);
            // for (String[] cloth : clothes){
            //     System.out.println(cloth[1]);
            // }

            Clothes solution = new Clothes();
            System.out.println(solution.solution(clothes));
            
        }


        public int solution(String[][] clothes) {

            // 문제 정리
            // 서로 다른 옷의 조합의 수를 구하세요.
            // 1. 매일 다른옷을 입고 출근한다.  
            // 2. 오늘 입은 옷을 내일 입지 않아도 다르다고 인정, 단 아무것도 입지 않고 출근할 수 는 없다.
            // 안경과 티셔즈, 청바지가 있을때 조합의 수 2x2x2-1 = 5(가지)

            // *왜 2임? : 안경을 쓰고 나간다/ 벗고 나간다 의 두가지 경우의 수가 있다.
            // *왜 -1임? : 아무것도 입지 않고 출근할 수는 없기 떄문에 아무것도 입지 않는 경우의 수 1을 빼준다. 

            HashMap<String, Integer> map = new HashMap<>();
            int answer = 1;

            // hashMap의 getOrDefault 를 통해 옷의 종류별 갯수를 구하자(ex:얼굴,상의,하의,겉옷)
            // 입지 않는 경우의 수도 있기 때문에 옷의 종류마다 1을 더해준다.
            for (String[] clothe : clothes){
                String type = clothe[1];    
                map.put(type, map.getOrDefault(type, 0) + 1 );
            }

            // Iterator를 사용해서 조합의 수를 계산해보자
            // it.hasNext() : 다음 원소가 존재하면 true, 없으면 false 반환
            // it.nest() : 다음 원소를 가져온다. 
            Iterator<Integer> it = map.values().iterator();

            while(it.hasNext()){
                answer *= it.next() + 1;
            }            


            // 1을 뺴주는 것을 잊지말자. 아무것도 입지 않고 출근하면 큰일난다!
            return answer -1;

            
        }
}
