import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShuffledBookShelf {

    public static int minimumMoves(String[] original, String[] shuffled){
        if(original.length == 0 && shuffled.length == 0)
            return 0;

        Map<String, Integer> positionMap = new HashMap<>();

        for (int i = 0; i < original.length; i++) {
            positionMap.put(original[i], i);
        }

        int moves = 0;
        for (int i = 0; i < original.length; i++) {
            int realIndex = positionMap.get(shuffled[i]);
            if(i != realIndex){
                String temp = shuffled[i];
                shuffled[i] = shuffled[realIndex];
                shuffled[realIndex] = temp;

                moves++;
            }
            if(Arrays.equals(original,shuffled))
                break;
        }
        return moves;
    }

    public static void main(String[] args) {

        String[] original = {
                "A Tale of Two Cities",
                "Bella",
                "Brave New World",
                "Catcher in the Rye",
                "Don Quixote",
                "Emma",
                "Frankenstein",
                "Great Expectations"
        };

        String[] shuffled = {
                "Brave New World",
                "A Tale of Two Cities",
                "Emma",
                "Catcher in the Rye",
                "Great Expectations",
                "Bella",
                "Frankenstein",
                "Don Quixote"
        };

        int moves = minimumMoves(original, shuffled);
        System.out.println(moves);

    }
}
