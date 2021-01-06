import java.util.*;

class Q7 {
    public String[] Q7(String[] strings, int n) {
        
        // for(int i=0; i<strings.length; i++) {
        //     strings[i] = strings[i].charAt(n) + strings[i];      
        // }
        // Arrays.sort(strings);       
        // String[] ss = new String[strings.length];
        // for(int i=0; i<strings.length; i++) {
        //     ss[i] = strings[i].substring(1,strings[i].length());
        // }
        // return ss;
        
        Arrays.sort(strings, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n) > o2.charAt(n))
                    return 1;
                else if(o1.charAt(n) == o2.charAt(n))
                    return o1.compareTo(o2);
                else 
                    return -1;
            }
        });
        return strings;
    }
}