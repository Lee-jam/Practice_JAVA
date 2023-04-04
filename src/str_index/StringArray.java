package str_index;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringArray {
	Scanner scan = new Scanner(System.in);
	
	String inputString() {
		System.out.print("문자를 입력하세요. : ");
		String str = scan.next();
		
		return indexofStr(str);
	}
	
	private String indexofStr(String str) {
		String[] strr = str.split("");
		int count = 0;
		String answer = "";
		Map<String, Integer> strmap = new HashMap<>();
		
		for(int i=0; i<str.length();i++) {
			for(int j=0; j<str.length();j++) {
				if(strr[j].equals(strr[i])){
					count += 1;
				}
			}
			strmap.put(strr[i], count);
			count = 0;
		}
		Set<String> AlpaSet = strmap.keySet();
		Iterator<String> alpa = AlpaSet.iterator();
		int temp = str.length();
		int value = 0;
		while(alpa.hasNext()) {
			String alpabet = alpa.next();
			value = strmap.get(alpabet);
			if(temp>value) {
				answer = alpabet; 
				temp=value;
			}
			else if(temp==value) {
				answer +=alpabet;
			}
		}
		
		return sortStr(str,answer);
	}
	private String sortStr(String str, String answer) {
		ArrayList<String> temparr = new ArrayList<>(Arrays.asList(answer.split("")));
		String sortAnswer="";
		String temp = "";
		System.out.println(answer+temparr);
		int index = 0;
		int temidx = 0;
//		String[] answerArr = answer.split("");
		//str = 내가 입력한 값
		//answer = 입력한 값 중 반복이 가장 적은 알파벳 문자열
		//temparr = answer을 한글자씩 split한 배열
		for(String a : temparr) {
			index = str.indexOf(a);
			if(sortAnswer.equals(""))
			{
				if(str.length()>index) {
					sortAnswer = a;
					temp = sortAnswer;
					System.out.println(a);
				}
			}
			else {
				temidx = str.indexOf(temp);
				if(index>temidx) {
					sortAnswer += a;
					temp = a;
					System.out.println(a);
				}
				else if(index<temidx) {
					sortAnswer = sortAnswer+a;
					temp = a;
					System.out.println(a+a);
				}
			}
//			else if(str.leng())//하다 맘
		}

		return sortAnswer;
		
	}
}
