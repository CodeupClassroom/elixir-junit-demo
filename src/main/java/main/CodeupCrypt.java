package main;

public class CodeupCrypt {
    public static Double version = 1.1;

    public static String hashPassword(String stringToHash) {
        String hashedString = "";
        for (int i = 0; i < stringToHash.length(); i++) {
            char c = stringToHash.charAt(i);
            if(c == 'a' || c == 'A') {
                hashedString += "4";
            } else if(c == 'e' || c == 'E') {
                hashedString += "3";
            } else if(c == 'i' || c == 'I') {
                hashedString += "1";
            } else if(c == 'o' || c == 'O') {
                hashedString += "0";
            } else if(c == 'u' || c == 'U') {
                hashedString += "9";
            } else {
                hashedString += c;
            }
        }
        return hashedString;
    }
}
