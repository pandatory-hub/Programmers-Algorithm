import java.util.Collections;
import java.util.LinkedList;

class Q20 {
    public int[] Q20(int[] arr) {
        int[] answer = {};
        LinkedList<Integer> list = new LinkedList<>();
        
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        if(list.size() != 1) {
            list.remove(Collections.min(list));
            
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        else
            answer = new int[] {-1};
        return answer;
    }
}