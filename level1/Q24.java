class Q24 {
    public String Q24(int n) {
//         String answer = "";
        
//         for(int i=1; i<=n; i++) {
//             if(i%2==1)
//                 answer += "수";
//             else
//                 answer += "박";
//         }
//         return answer;
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) 
            sb = (i%2==1 ? sb.append("수") : sb.append("박"));
        return sb.toString();
    }
}