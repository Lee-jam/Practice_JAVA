//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
//문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
package levelzero;

public class RemoveVowel {
    public String solution(String my_string) {

        String answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}

// 정규식을 활용하여 문자열에서 원하는 문자를 제거할 수 있음.