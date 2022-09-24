import java.util.Scanner;
public class MorseCode8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String morse = scanner.nextLine();
        String morseToNums = "";
        String numInMorse = "";
        for (int i =0;i<morse.length();i++){
            if (morse.charAt(i)==' '){
                morseToNums+=' ';
            }else{
                numInMorse+= morse.charAt(i);
            }
            if (numInMorse.length()==5){
                morseToNums+=morseToNum(numInMorse);
                numInMorse="";
            }
        }
        String finalAns = "";
        for (int i=0;i<morseToNums.length();i++){
            if (morseToNums.charAt(i)==' '){
                finalAns+=' ';
                continue;
            }
            if (Integer.parseInt(morseToNums.substring(i,i+2))<33){
                finalAns+= (char) Integer.parseInt(morseToNums.substring(i,i+3));
                i+=2;
            }else{
                finalAns+= (char) Integer.parseInt(morseToNums.substring(i,i+2));
                i+=1;
            }
        }
        finalAns = finalAns.replaceAll("[^A-Za-z\s]", "");
        if (finalAns.isBlank()){
            System.out.println("No valid message");
        }else{
            System.out.println(finalAns);
        }
    }
    public static int morseToNum(String morseChar) {
        int ans =0;
        if (morseChar.charAt(0)=='_'){
            ans+=5;
        }
        for (int i=0; i<morseChar.length();i++){
            if (morseChar.charAt(i)==morseChar.charAt(0)){
                ans++;
            }else{
                break;
            }
        }
        return  ans%10;
    }
}
