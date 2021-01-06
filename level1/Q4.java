class Q4 {
    
    int pcnt = 0;
    int ycnt = 0;
    
    boolean Q4(String s) {
        boolean answer = true;
    
        result(s);
        
        if(pcnt != ycnt)
            answer = false;
        
        return answer;
    }
    
    
    void result(String s) { 
        String[] ss = s.split("");
        for(int i=0; i<ss.length; i++) {
            // if(ss[i].equals("p") || ss[i].equals("P"))
            //     pcnt += 1;
            // if(ss[i].equals("y") || ss[i].equals("Y"))
            //     ycnt += 1;
            
            if(ss[i].equals("p"))
                pcnt += 1;
            else if(ss[i].equals("P"))
                pcnt += 1;
            if(ss[i].equals("y"))
                ycnt += 1;
            else if(ss[i].equals("Y"))
                ycnt += 1;
        }
    }        
}