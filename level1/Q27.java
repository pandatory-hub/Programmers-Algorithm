class Q27 {
    public int Q27(int num) {
//         long n = num;
//         int cnt = 0;
        
//         while(n > 1) {
//             if(cnt >= 500) {
//                 cnt = -1;
//                 break;
//             }
//             n = n%2==0 ? n/2 : n*3+1;
//             cnt++;
//         }
//         return cnt;
        
        long n = (long)num;
        for(int i=0; i<500; i++) {
            if(n==1)
                return i;
            n = (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }
}