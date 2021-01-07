class Q13 {
    public String Q13(String phone_number) {        
        String answer = phone_number.substring(phone_number.length() - 4, phone_number.length());        
        return new String(new char[phone_number.length() - 4]).replace("\0", "*") + answer;
    }
}