import java.util.*;

class Q38 {
    public int[] Q38(int[] num) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<num.length; i++) {
            for(int j=i+1; j<num.length; j++) {
                int c = num[i] + num[j];
                if(list.indexOf(c) < 0)
                    list.add(c);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        Arrays.sort(answer);
        
//         Set<Integer> set = new HashSet<>();
        
//         for(int i=0; i<num.length; i++) {
//             for(int j=i+1; j<num.length; j++)
//                 set.add(num[i] + num[j]);
//         }
        
//         return set.stream().sorted().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}