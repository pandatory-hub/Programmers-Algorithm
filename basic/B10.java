public class B10 {
    public static void main(String[] args) {
        int num = 3;
        int nnum = 1;

        for(int j=0; j<num; j++) {
            for(int i=0; i<num; i++) {
                System.out.printf("%4d", nnum);
                nnum++;
            }
            System.out.println();
        }
    }
}
