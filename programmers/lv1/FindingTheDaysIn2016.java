import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindingTheDaysIn2016 {
    // 2024-09-24
    // 2016
    public String solution(int a, int b) {
        // 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
        // 2016년은 윤년입니다.
        // * 윤년 : 1년이 366일 인 해(2/29까지 있음)
        String answer = "";

        LocalDate startDate = LocalDate.of(2016, 1, 1);
        LocalDate endDate = LocalDate.of(2016, a, b);

        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        long daysDifference = ChronoUnit.DAYS.between(startDate, endDate);

        answer = day[((int)daysDifference % day.length)];

        return answer;
    }

    // 라이브러리를 이용해서 푸는게 맞는걸까..
}
