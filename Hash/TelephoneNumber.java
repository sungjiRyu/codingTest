import java.util.HashMap;

public class TelephoneNumber {
    public static void main(String[] args) {

    }

    public boolean solution(String[] Phone_book ){

        boolean answer = true;
        HashMap<String, Integer> phoneNum = new HashMap<>();
       
        // 1. phone_book을 HashMap에 넣는다.(나중에 containsKey를 사용하기 위함)
        for(int i = 0; i < Phone_book.length; i++){
        phoneNum.put(Phone_book[i], i);
        }

        // 2. phone_book의 원소 각각을
        for(int i = 0; i < Phone_book.length; i++){
            // 3. HashMap의 원소와 비교한다(containsKey는 같은 값이 있으면 true(값이 포함된 것은 그냥 contains))
            for(int j = 0; j < Phone_book[i].length(); j++){
                if(phoneNum.containsKey(Phone_book[i].substring(0,j)))
                {
                    return false;
                }
            }
        }

        return answer;
    }
}
