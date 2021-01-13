import java.util.Arrays;

class Q36 {
    public int Q36(int[] d, int budget) {
        int answer = 0;
        int res = 0;
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++) {
            res += d[i];
            if(res > budget)
                break;
            answer++;
        }
        return answer;
    }
}