import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    static String dnaFrequency(String str) {
        // Initialize all DNA bases with 0
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        freqMap.put('A', 0);
        freqMap.put('C', 0);
        freqMap.put('G', 0);
        freqMap.put('T', 0);

        // Count only valid DNA bases
        for (char ch : str.toCharArray()) {
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            }
        }

        // Build output
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            result.append(entry.getKey()).append(":").append(entry.getValue()).append("  ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
//      String input = "ABABABABABABB";
        String input = "AACCDAABB";
        System.out.println(dnaFrequency(input));
    }
}
