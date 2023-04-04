//문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요
package levelzero;
public class StringInNum {
	public int solution(String my_string) {
        int answer = 0;

    for(int i=0; i<my_string.length();i++){
        if(my_string.charAt(i)>=48&&my_string.charAt(i)<=57){
            answer += Character.getNumericValue(my_string.charAt(i));
        }
        }
        return answer;
    }
}
