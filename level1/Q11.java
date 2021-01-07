import java.util.Arrays;
// import java.util.Collections;

class Q11 {
    public String Q11(String s) {
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        return new StringBuilder(new String(ss)).reverse().toString();
        
        // String[] ss = s.split("");
        // Arrays.sort(ss);
        // Collections.reverse(Arrays.asList(ss));
        // return String.join("", ss);
    }
}