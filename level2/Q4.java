import java.util.*;

class Q4 {
    public int[] Q4(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        ArrayList<Integer> prog = new ArrayList<>();
        ArrayList<Integer> time = new ArrayList<>();
        for(int i=0; i<progresses.length; i++) {
            prog.add(progresses[i]);
            time.add(speeds[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        
        while(prog.size() > 0) {
            for(int i=0; i<prog.size(); i++) {
                prog.set(i, prog.get(i) + time.get(i));
            }
            int cnt = 0;
            for(int i=0; i<prog.size(); i++) {
                if(i==0 && prog.get(i) >= 100) {
                    cnt++;
                    prog.remove(i);
                    time.remove(i);
                    i--;
                } else if(cnt > 0 && prog.get(i) < 100)
                    break;
                else if(cnt > 0 && prog.get(i) >= 100) {
                    cnt++;
                    prog.remove(i);
                    time.remove(i);
                    i--;
                }
            }
            if(cnt > 0) {
                result.add(cnt);
            }
        }
        answer = new int[result.size()];
        
        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}