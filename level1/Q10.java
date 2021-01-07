//import java.util.Arrays;

class Q10 {
    public String Q10(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }                
        }
        return answer;
    }
        // int a = Arrays.asList(seoul).indexOf("Kim");
        // return "김서방은 " + a + "에 있다";
}
