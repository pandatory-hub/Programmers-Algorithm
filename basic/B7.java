public class B7 {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrimeNum = true;

        for(int i=2; i < num/2; i++) {
            if(num % i == 0) {
                isPrimeNum = false;
            }
        }
        if(isPrimeNum) {
            System.out.println(num + "은 소수");
        }
        else {
            System.out.println(num + "은 소수 아님");
        }
    }
    
}
