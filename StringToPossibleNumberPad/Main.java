/*
* This returns all possible strings that a specified digit
* could return on a number pad.
*
* number pad values are stored in the hashmap
*
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String args[]){

        String theInput = "925";

        System.out.print(getCombos(theInput));

    }

    public static ArrayList<String> getCombos(String digits) {
        ArrayList<String> sampleOutput = new ArrayList<String>();
        ArrayList<String> possibleLetters = new ArrayList<String>();
        sampleOutput.add("");

        for(int i=0;i<digits.length();i++) {
            String letter = null;
            for (String str : sampleOutput) {
                letter = map.get(digits.charAt(i));

                for (int j = 0; j < letter.length(); j++) {
                    possibleLetters.add(str + letter.charAt(j));
                }
            }
            sampleOutput = possibleLetters;
            possibleLetters = new ArrayList<String>();
        }
        return sampleOutput;
    }

    static final HashMap<Character,String> map = new HashMap<Character,String>(){{
        put('1', "-");
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
        put('0', "=");
    }} ;
}
