package programs;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInString {

    static void duplicateCharInString(String inputString){

        //Creating HashMap Containig char as key and its occurrence as value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        //Converting given String to the char array
        char[] strArray = inputString.toCharArray();

        //Checking Each Char of strArray
        for(char c : strArray){
            if(charCountMap.containsKey(c)){
                //if char is present in charCountMap, increamenting its count by 1
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else{
                //if char is not present in charCountMap,
                //putting this char to charCountMap with 1 as its value
                charCountMap.put(c,1);
            }
        }
        //Getting Set containing all keys of charCountMap
        Set<Character> charsInString  = charCountMap.keySet();
        System.out.println("Duplicate Characters in : "+inputString);

        //Iteratin through Set 'charsInString'
        for(Character ch : charsInString){
            //if any char has a count of more than 1,printing its count
            System.out.println(ch +" : "+ charCountMap.get(ch));
        }
    }
    public static void main(String[] args) {
        duplicateCharInString("Learn Java Programming");

    }
}
