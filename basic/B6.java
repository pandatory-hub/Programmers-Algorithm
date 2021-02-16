import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int big = 0;
        int small = 0;
        
        if(a > b) {
            big = a;
            small = b;
        }
        else {
            big = b;
            small = a;
        }

        int ans = 1;

        for(int i=1; i<small; i++) {
            if(big % i == 0 && small % i == 0) {
                ans = i;
            }
        }
        System.out.print(ans);
    }
}
