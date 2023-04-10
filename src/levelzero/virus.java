/*
 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
 * 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 
 * 세균의 수를 return하도록 solution 함수를 완성해주세요.
 */
package levelzero;

public class virus {
    public int solution(int n, int t) {
        for(int i =1; i<=t;i++){
            n=n*2;
        }
        int answer = n;
        return answer;
    }


    //1시간마다 2배씩이기 때문에 shift 비트 연산자인 <<을 이용하여 비트이동
    // n번 만큼 <- 이쪽으로 t의 비트를 이동
    public int solution2(int n, int t){
        int answer = n << t;

        return answer;
    }
}
