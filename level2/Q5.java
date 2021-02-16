import java.util.*;

class Q5 {
    public int Q5(int[] priorities, int location) {
        int answer = 1;
        
        PriorityQueue p = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int task : priorities) {
            p.add(task);
        }
        
        while(!p.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                if(priorities[i] == (int)p.peek()) {
                    if(i == location) {
                        return answer;
                    }
                    p.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}