class Q25 {
    public long Q25(long n) {
//         long answer = 0;
        
//         for(int i=1; i<=n ; i++) {
//             int res = i*i;
//             if(n == res) {
//                 answer = (i+1) * (i+1);
//                 break;
//             }
//             if(i == n) {
//                 answer = -1;
//                 break;
//             }
//         }
//         return answer;
        long val = (long) Math.sqrt(n);
        
        return (val*val) == n ? (val+1)*(val+1) : -1;
    }
}