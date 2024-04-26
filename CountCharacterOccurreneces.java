package programs;

public class CountCharacterOccurreneces {

    public static void main(String[] args) {
        String str = "Java is java again java again";

        char c = 'g';

        int count = str.length()-str.replace("g","").length();
        System.out.println("The Number of Occurrence of "+c+" is : "+count);
    }
}
