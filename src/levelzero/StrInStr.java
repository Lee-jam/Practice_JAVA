//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
package levelzero;
public class StrInStr {
	public int solution(String str1, String str2) {
		
		int answer = str1.indexOf(str2)>=0?1:2;
		
        return answer;
    }
}
