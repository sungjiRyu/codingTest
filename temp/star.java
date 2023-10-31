public class star {
    public static void main(String[] args) {
        // 반복문을 이용해 별 출력해보기
        
        
        for(int i = 1; i <= 5; i++) {
            String stars = "";
            for(int j = i; j <= 5; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }

        System.out.println();

        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
     
        System.out.println();
        // 피라미드 찍기
        for(int i = 1; i < 10; i+=2){
            for(int j = 10; j > i; j-=2){
                System.out.print(' ');
            }
            for(int j = 0; j < i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}