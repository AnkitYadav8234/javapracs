package programs;

public class ReverseStringWithReserveSpacePosition {
    static void reverseString(String inputString){

        //Converting inputString to char array inputStringArray
        char[] inputStringArray = inputString.toCharArray();

        //Defining a new char array 'resultArray' with same size as inputStringArray
        char[] resultArray = new char[inputStringArray.length];

        //first for loop :
        //for every spaces in the 'inputStringArray',
        //we insert spcaes in the 'resultArray' at the corresponding positions
        for(int i =0; i< inputStringArray.length;i++){
            if(inputStringArray[i] ==' '){
                resultArray[i] = ' ';
            }
        }

        int j = resultArray.length-1;

        //Second for loop :
        //We copy every non space charactor of inputrStringArray,
        //from first to last at 'j' postion of resultArray

        for(int i =0;i<inputStringArray.length;i++){
            if(inputStringArray[i]!=' '){
                //if resultarray alread has at index j then decrementing 'j'
                if(resultArray[j] == ' '){
                    j--;
                }
                resultArray[j] = inputStringArray[i];
                j--;
            }
        }
        System.out.println(inputString+" ---> "+String.valueOf(resultArray));


    }

    public static void main(String[] args) {
        reverseString("Ankit Yadav");
    }
}
