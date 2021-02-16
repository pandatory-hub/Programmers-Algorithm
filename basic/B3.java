import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputNum = new int[10];
        for(int i=0; i<10; i++) {
            inputNum[i] = sc.nextInt();
        }

        int[] mode = new int[10];
        for(int i=0; i<10; i++) {
            mode[inputNum[i]]++;
        }

        int modeNum = 0;
        int modeCnt = 0;

        for(int i=0; i<10; i++) {
            if(modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }

        System.out.println("최빈수 : " + modeNum + " 횟수 : " + modeCnt);

    }
}
