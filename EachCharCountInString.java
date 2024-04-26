package programs;

import java.util.HashMap;

public class EachCharCountInString {

    static void characterCount(String inputString){

        //Creating a hashmap containing char as key and occerrence as a value
        HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();

        //Converting given string to char array
        char[] strArray = inputString.toCharArray();

        //checking each character strArray
        for(char c : strArray){
            if(charCountMap.containsKey(c)){

                //if char is present in charCountMap, increamenting its count by 1
                if(c!=' ') {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                }
            }
            else{
                //if the char is not present in charCountermap,
                //putting this char to charCountMap with 1 as its value
                if(c!=' ') {
                    charCountMap.put(c, 1);
                }
            }
        }
        //printing the charCountMap
        System.out.println(charCountMap);

    }
    public static void main(String[] args) {
        characterCount("All is Well");
    }
}
