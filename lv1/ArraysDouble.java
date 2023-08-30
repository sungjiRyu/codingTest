import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDouble {
    public static void main(String[] args) {
        

        ArraysDouble arrDouble = new ArraysDouble();
        int a[] = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arrDouble.solution(a))); 
    }
    public int[] solution(int[] numbers) {
        
        for(int i = 0; i < numbers.length; i++)
        {
             numbers[i]*=2;
        }
        return numbers;
    }
}