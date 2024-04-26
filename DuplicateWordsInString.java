package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
    static void duplicatesWords(String inputString){

        //Splitting inputString into words
        String[] words = inputString.split(" ");

        //Creating one Hashmap with words as key and their count as value
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

        //Checking Each word
        for(String word :words)
        {
            //whether it is present in wordCount
            if(wordCount.containsKey((word.toLowerCase()))){

                //if it is present increamenting its count by 1
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()+1));
            }
            else {

                //if it is not present, put that word into wordCount with 1 as its value
                wordCount.put(word.toLowerCase(),1);
            }
        }

        //Extracting all keys of wordCount
        Set<String> wordInString = wordCount.keySet();
      //  Set<Map.Entry<String, Integer>> entrySet = wordCount.entrySet();



        //Iterating through all words in wordInString
        for (String word : wordInString) {

            //if word count is greater than 1
            if (wordCount.get(word) > 1) {

                //printing its words and count
                System.out.println(word + " : " + wordCount.get(word));
            }
        }


    }

    public static void main(String[] args) {
        duplicatesWords("Bread butter and bread");
    }
}
