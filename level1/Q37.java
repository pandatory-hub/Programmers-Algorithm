class Q37 {
    public int Q37(int n) {
        String s = "";
        
        while(n != 0){ 
            if( (n % 3) < 10 ) { 
                s = (n % 3) + s; 
                n /= 3;
            } 
        }
  
        int answer = 0;
        int r = 1;
        
        for(int i=0; i<s.length(); i++) {
            answer += Integer.parseInt(s.charAt(i)+"")*r;
            r*=3;
        } 
        return answer;
    }
}