package practice;

import java.util.HashMap;

public class CountWords {

    public static void main(String[] args) {
        String str = "I am am learning java java.";

        HashMap<String, Integer> map = new HashMap<>();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (!map.containsKey(s[i])) {
                map.put(s[i],1);
            }
            else {
                map.put(s[i], map.get(s[i])+1);
            }
        }

        for (String x : map.keySet()){
            System.out.println("The count of words is : "+x+" = "+map.get(x));
        }
        
    }
}
