class Solution {
    public int[] Q17(int n, int m) {
        int[] answer = new int[2];
        int bigNum = 0;
        
        if(n < m) 
            bigNum = m;
        else
            bigNum = n;
        
        int i = bigNum;
        while(1 < bigNum) {
            if(n%i==0 && m%i==0) {
                //유클리드 호제법 : 두 수를 곱한 뒤 최대공약수로 나누면 최소공배수
                answer[0] = i;
                answer[1] = n*m / i;
                break;
            }
            i = i - 1;
        }        
        return answer;
    }
}