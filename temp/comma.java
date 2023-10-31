import java.text.DecimalFormat;

public class comma {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###");

        double money = 1000000;
        String str = String.format("%,d", money);

        // int amount = 10000;
        // String money = df.format(amount);
        System.out.println(str);

    }

    // 숫자를 입력했을때 천단위로 콤마(,) 를 찍어주는 함수 만들어봐라(널리소프트 java 1)
     String excute(int num){
        String answer = "";

        // 1,000 / 10,000 / 100,000 / 1,000,000 / 10,000,000 / 100,000,000
        // 1. 0의 수 / 3 의 몫 만큼 콤마가 붙는다
        // 2. num 을 배열로 만듬 -> 가장 뒷자리부터 앞자리까지 셈 -> 세아렸을때 4이상일 시 맨뒤 - 3 번째 자리 콤마 삽입 -> 다시 세아림 -> 반복

        int money = 1000000;
        String str = String.format("%,d", money);



        return answer;
    }
}
