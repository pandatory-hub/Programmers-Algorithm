class Solution {
    public double result(int[] arr) {
        double sum = 0;        
        for(int i=0; i<arr.length; i++){
            sum += arr[i];            
        }        
        return sum / arr.length;
    }  
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Solution r = new Solution();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + r.result(arr));
    }
}

// 아래는 프로그래머스에 제출한 답

// class Result {
//     public static double result(int[] arr) {
//         int sum = 0;        
//         for(int i=0; i<arr.length; i++){
//             sum += arr[i];            
//         }        
//         return sum;
//     }
// }

// class Solution {
//     public double solution(int[] arr) {
//         double answer = Result.result(arr) / arr.length;      
//         return answer;
//     }
// }

