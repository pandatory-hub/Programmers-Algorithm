public class Q28 {
    public int Q28(int n) {
//         int answer = 0;

//         String s = Integer.toString(n);        
//         for(int i=0; i<s.length(); i++) {
//             answer += Integer.parseInt(s.charAt(i) + "");
//         }

//         return answer;
        int answer = 0;
        
        while(n > 0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}