public class B21 {
    public static void main(String[] args) {
        boolean arr[] = new boolean[101];
        int[] inArr = new int[101];
        inArr[0] = 1;    
        inArr[1] = 2;    
        inArr[2] = 3;    
        inArr[3] = 1;    
        inArr[4] = 1;    
        inArr[5] = 2;    
        inArr[6] = 3;    
        inArr[7] = 7;
        
        for(int i=0; i<=100; i++) {
            arr[inArr[i]] = true;
        }

        for(int i=1; i<=100; i++) {
            if(arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
