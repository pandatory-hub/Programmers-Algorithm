//import java.time.*;

class Q5 {
    public String Q5(int a, int b) {
        String answer = day(a, b);
        return answer;
    }
    
    private String day(int a, int b) {
        int days = 0;
        
        if(a>1) {
            for(int i=1; i<a; i++)
                days += getMonth(i);
        }
        
        days += b;
        int dday = days % 7;
        
        switch(dday) {
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            case 6:
                return "WED";
            default:
                return "THU";
        }
    }
    
    private int getMonth(int a) {
        if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)
            return 31;
        else if(a==2)
            return 29;
        else
            return 30;
    }
    
    //return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
}