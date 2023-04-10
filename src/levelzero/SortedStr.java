package levelzero;

import java.util.*;

public class SortedStr {
    public int[] solution(String my_string) {
        String[] str = my_string.split("");
        ArrayList<Integer> temp = new ArrayList<>();
        int i=0;
        for(String cha : str){
            if(cha.matches("[0-9]")){
                temp.add(Integer.parseInt(cha));
            }
            i++;
        }
        Collections.sort(temp);
        int[] answer = new int[temp.size()];
        i=0;
        for(int j : temp){
            answer[i] = j;
            i++;
        }
        return answer;
    }
}
// 다른 방법, replaceAll로 없애기, Stream 사용하기