package star;

import java.util.Scanner;

public class PrintStar {
	private String star = "*";
	Scanner scan = new Scanner(System.in);
	
	void inputNum() {
		System.out.print("숫자를 입력하세요 :");
		String num = scan.next();
		if(!num.contains(".")) {
			star(Integer.parseInt(num));
		}
		else{
			try{
				star(Double.parseDouble(num));
			}catch(NumberFormatException e) {
				System.out.println("잘못된 값을 입력했습니다.");
				inputNum();
			}
		}
	}
	void star(int num) {
		for(int i = 0; i<num ; i++) {
			System.out.print(star);
		}
	}
	void star(double num) {
		for(int i = 0; i<num ; i++) {
			System.out.println(star);
		}
	}
	
	
}
