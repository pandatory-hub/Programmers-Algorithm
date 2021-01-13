class Q35 {
    public int Q35(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}