class Q2 {    
    public long q2(int a, int b) {
        long sum = 0;
        int num = 0;
        if(a > b) {
            num = a - b;
            for(int i=0; i<num + 1; i++) {
                sum += b++;
            }
            return sum;
        }
        else if(a < b) {
            num = b - a;
            for(int i=0; i<num + 1; i++) {
                sum += a++;
            }
            return sum;
        }
        else
            return a;
    }

    //test
    public static void main(String[] args) {
        Q2 ans = new Q2();
        System.out.println(ans.q2(3, 5));
        System.out.println(ans.q2(3, 3));
        System.out.println(ans.q2(5, 3));
    }
}


//best answer//

// class Solution {

//     public long solution(int a, int b) {
//         return sumAtoB(Math.min(a, b), Math.max(b, a));
//     }

//     private long sumAtoB(long a, long b) {
//         return (b - a + 1) * (a + b) / 2;  //등차수열의 합 공식
//     }
// }
