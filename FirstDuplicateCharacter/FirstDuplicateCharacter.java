import java.util.HashMap;
import java.util.Map;

public class FirstDuplicateCharacter {
  
    private static char getFirstDuplicateChar(String input){
        if(input == null || input.isEmpty())
            return '0';

        char[] arr = input.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for (char c: arr){
            map.put(c, map.getOrDefault(c,0)+1);
            if(map.get(c) == 2)
                return c;
        }
        return '0';

    }

    public static void main(String[] args){
        String input = "apple";
        char result = getFirstDuplicateChar(input);
        System.out.println(result);
    }

}
