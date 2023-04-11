package str_index;

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
			//temp 1번 알파벳의 반복된 횟수(3)
			// value Map 키값으로 받아온 벨류값(반복된 횟수)
			// 반복된 횟수가 가장 적은 알파벳
			if(temp>value) {
				answer = alpabet; 
				temp=value;
			}
			//반복 횟수가 같으면 a=2 b=2
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
		int index = 0;
//		String[] answerArr = answer.split("");
		for(String a : temparr) {
			index = str.indexOf(a);
			if(str.length()>index) {
				sortAnswer += a;
			}
//			else if()//하다 맘
		}
		
		return sortAnswer;
		
	}
}
