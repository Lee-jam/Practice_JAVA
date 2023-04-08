/*
 * 문자열 my_string이 매개변수로 주어질 때,
 * 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
package levelzero;

class upperAndlower{
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length();i++){
            if(my_string.charAt(i)>='a'&&my_string.charAt(i)<='z'){
                answer += Character.toString(my_string.charAt(i)).toUpperCase();
            }
            else if(my_string.charAt(i)>='A'&&my_string.charAt(i)<='Z'){
                answer += Character.toString(my_string.charAt(i)).toLowerCase();
            }
            else{
                answer += Character.toString(my_string.charAt(i));
            }
        }
        
        return answer;
    }
}