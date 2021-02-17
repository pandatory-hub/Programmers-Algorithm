public class B14 {
    public static void main(String[] args) {
        int num = 421314218;
        int[] arr = new int[10];

        while(num > 0) {
            arr[num % 10]++;
            num /= 10;
        }

        for(int i=0; i<10; i++) {
            System.out.println(i + " : " + arr[i]);
        }
    }
}
