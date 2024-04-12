
// Given an integer x, return true if x is a palindrome
// , and false otherwise.

import java.util.Collection;
import java.util.Collections;

public class PalindromeNumber {

        public boolean isPalindrome(int x) {

            boolean answer = false;

            //  int x 를 string 으로 변환
            String stringX = Integer.toString(x);
            
            //  stringX 를 담을 배열 선언
            int[] listX = new int[stringX.length()];

            //  char 타입을 int로 변환 ( 0~9 까지의 ASCII는 48~57 따라서 각 숫자에서 0을 빼면 int 타입으로 변환할 수 있다.
            //  ex: 1 - 0 = (ASCII) 49 - (ASCII) 48 = 1(int) )
            for(int i = 0; i < stringX.length(); i++) {
                listX[i] = stringX.charAt(i) - '0';
            }

            //  stringX 원소를 역순으로 담을 배열 선언
            int[] reverseX = new int[stringX.length()];

            for(int i = stringX.length()-1; i > 0; i--){
                listX[i] = reverseX[(stringX.length()-1) - i];
            }

            if(listX.equals(reverseX)) return true;
            
            
            

            return answer;
            
        }
    
}
