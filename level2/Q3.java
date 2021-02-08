class Q3 {
    public int Q3(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;
                if(sum == n) {
                    answer++;
                    break;
                }
                else if(sum > n)
                    break;
            }
        }
        return answer;
    }
}