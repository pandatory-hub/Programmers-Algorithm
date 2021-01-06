import java.util.*;

class Q6 {
    public int[] Q6(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : arr) {
            if(i%divisor == 0)
                list.add(i);
        }
        if(list.isEmpty())
            list.add(-1);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
        
        //return Arrays.stream(arr).filter(i -> i%divisor==0).toArray();
    }
}
