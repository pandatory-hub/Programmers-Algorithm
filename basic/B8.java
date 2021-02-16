public class B8 {
    public static void main(String[] args) {
        int num = 5;
        int ans = 1;

        for(int i=num; i >= 1; i--) {
            ans *= i;
        }
        System.out.println(ans);
    }
}
