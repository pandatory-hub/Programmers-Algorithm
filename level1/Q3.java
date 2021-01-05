import java.util.*;

public class Q3 {
    public int[] Q3(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int preNum = 10;
        for(int i : arr) {
            if(preNum != i && i <= 9)
                list.add(i);
            preNum = i;
            
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}