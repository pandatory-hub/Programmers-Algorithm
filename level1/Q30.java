class Q30 {
    public String Q30(String s, int n) {
        char[] charArr = s.toCharArray();
        for(int i=0; i<charArr.length; i++) {
            if(charArr[i] == ' ')
                continue;
            else if(Character.isLowerCase(charArr[i]))
                charArr[i] = (char) ((charArr[i] - 'a' + n) % 26 + 'a');
            else if(Character.isUpperCase(charArr[i]))
                charArr[i] = (char) ((charArr[i] - 'A' + n) % 26 + 'A');
        }
        return new String(charArr);
    }
}