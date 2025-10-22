import java.util.Arrays;

public class AnagramChecker {

    private static boolean isAnagramOrNot(String input1, String input2){

        if(input1.length() != input2.length()){
            return false;
        }

        char[] array1 = input1.toCharArray();
        char[] array2 = input2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }


    public static void main(String[] args){
        String word1 = "listen";
        String word2 = "silent";

        boolean result = isAnagramOrNot(word1, word2);
        System.out.println(result);

    }
}
