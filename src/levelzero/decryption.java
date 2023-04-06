/*
군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.

암호화된 문자열 cipher를 주고받습니다.
그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
*/
package levelzero;

import java.util.ArrayList;
import java.util.Arrays;

public class decryption {
    public String solution(String cipher, int code) {
        ArrayList<String> arr_str = new ArrayList<>(Arrays.asList(cipher.split("")));
        String answer = "";
        int code_Num = code;
        for (int i = 2;; i++) {
            if (code_Num > arr_str.size())
                break;

            answer += arr_str.get(code_Num - 1);
            code_Num = code * i;
        }
        return answer;
    }

    public String solution2(String cipher, int code) {
        int num = code;
        int i = 1;
        String answer = "";
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(cipher.split("")));
        while (true) {
            num = code * i;
            if (num > arr.size())
                break;
            answer += arr.get(num - 1);

            System.out.println(num);
            i++;

        }
        return answer;
    }
}