class Q21 {
    public int Q21(int n) {
        int answer = 0;
        
        int[] num = new int[n + 1];
        
        //2부터 n까지의 수를 배열에 넣는다
        for(int i=2; i<=n; i++)
            num[i] = i;
        
        //2부터 시작해서 그의 배수들을 0으로 만든다
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다
        for(int i=2; i<=n; i++) {
            if(num[i]==0)
                continue;
            
            for(int j=2*i; j<=n; j+=i)
                num[j] = 0;
        }
        
        //배열에서 0이 아닌 것들의 개수를 세준다
        for(int i=0; i<num.length; i++) {
            if(num[i] != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}