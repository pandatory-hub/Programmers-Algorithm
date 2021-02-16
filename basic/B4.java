import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] bin = new int[10];

        int i = 0;
        int mok = num;

        while(mok > 0) {
            bin[i] = mok % 2;
            mok /= 2;
            i++;
        }

        i--;
        for(; i>=0; i--) {
            System.out.print(bin[i]);
        }
    }        
}
