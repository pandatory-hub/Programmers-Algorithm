class Q14 {
    public boolean Q14(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6) {
            int i;
            for(i=0; i<s.length(); i++) {
                if(!Character.isDigit(s.charAt(i)))
                    break;
            }
        
        if(i == s.length())
            answer = true;
        }
        return answer;
    }
}