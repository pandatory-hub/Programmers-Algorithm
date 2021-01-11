class Q26 {
    public boolean Q26(int x) {
//         String[] ss = String.valueOf(x).split("");
        
//         int sum = 0;
//         for(String s : ss)
//             sum += Integer.parseInt(s);
//         if(x%sum==0)
//             return true;
//         else
//             return false;
        
        int mox = x;
        int sum = 0;
        while(x!=0) {
            sum += x%10;
            x /= 10;
        }
        return mox%sum==0 ? true : false;
    }
}