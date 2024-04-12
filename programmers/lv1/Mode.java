public class Mode {
    // 최빈값 구하기(최빈값 : 가장 자주 나오는 값)
    public int solution(int[] array) {
        int answer = 0;
        int[] countArray = new int [1001];  // 배열의 각 원소의 빈도를 세아릴 수 있는 객체 생성
        int max = 0; // countArray의 max값을 찾기 위한 객체
        int maxCount = 0;

        // array의 원소에 해당하는 countArray의 자리값마다 1을 더해준다.
        // ex) int[] array = [1,1,2,3] 이면 int[] countArray = [0,0,0,0,0,0,0 ....] 에서 
        // array 배열의 0번째(배열은 0부터시작) 자리가 1 => countArray 배열의 1번째 자리에 1을 더해줌 => countArray = [0,1,0,0,0,0,0 ...] 이 됨
        // array의 1번째 자리가 1 => countArray 배열의 1번째 자리에 1을 더해줌 => countArray = [0,2,0,0,0,0,0 ...]
        // countArray = [0,2,0,0,0,0...] => array 배열에서 1이 두번 나왔다는 것을 알 수 있게 된다.
        for(int i = 0; i < array.length; i++ ){
            countArray[array[i]] ++;
        }

        // countArrat 의 각각 원소들을 비교해서 가장 큰 값(=> array 의 최빈값) 을 찾아준다.
        for(int i = 0; i < countArray.length; i++){
            if(countArray[i] > max){
                max = countArray[i];
                answer = i;
            }
        }

        // 최빈값이 없다면 -1을 return
         for(int i = 0; i < countArray.length; i++){
            if(countArray[i] == max) maxCount ++;
            if(maxCount > 1) answer = -1;
         }

        return answer;
    }
}
