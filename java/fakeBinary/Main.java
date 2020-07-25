import java.util.*; 

public class Main {
    
    public static void main(String[] args){
        String poop = fakeBin("12345678");
        System.out.println(poop);
    }
    
    public static String fakeBin(String numberString) {
        
        char[] numChars = numberString.toCharArray();
        int charLen = numChars.length;
        int currCou = 1;
        int currNum;
        int newNum = 0;
        char charNum;
        char currChar;
        
        while(currCou <= charLen) {
            currChar = numChars[currCou - 1];
            currNum = Character.getNumericValue(currChar);
            if(currNum < 5){
                newNum = 0;
            } else if(currNum >= 5){
                newNum = 1;
            }
            charNum = (char)(newNum+'0');
            numChars[currNum - 1] = charNum;
            currCou = currCou + 1;
        }
        
        
        String finStrArr = new String(numChars);
        
        return finStrArr;
    }
}