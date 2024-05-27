public class HarshadNumber {
    // 2024-05-27
    // 하샤드 수
    public boolean solution(int x) {
        int sum = 0;
        String str = String.valueOf(x);

        String[] arr = str.split("");

        for (String s : arr) {
            sum += Integer.parseInt(s);
        }

        return  x % sum == 0;
    }
}
