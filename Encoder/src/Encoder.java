import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class Encoder to support encoding methods.
 */
public class Encoder {

    /**
     * First encode implementation - handling exception
     * @param str
     * @return String
     */
    protected static String encode(char[] str) {
        char currentChar = str[0];
        int count = 1;
        String output = "";
        for (int i = 0; i < str.length; i++) {
            try {
                if (currentChar == str[i+1]) {
                    count++;
                } else {
                    output = output + currentChar + count;
                    count = 1;
                    currentChar = str[i+1];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                output = output + currentChar + count;
            }
        }
        return output;
    }

    /**
     * Second encode implementation - without exception handling.
     * @param str
     * @return String
     */
    protected static String encode2(char[] str) {
        char currentChar = str[0];
        int count = 1;
        String output = "";
        for (int i = 0; i < str.length; i++) {
            if(i+1 < str.length) {
                if (currentChar == str[i+1]) {
                    count++;
                } else {
                    output = output + currentChar + count;
                    count = 1;
                    currentChar = str[i+1];
                }
            } else {
                output = output + currentChar + count;
            }
        }
        return output;
    }

    /**
     * Third encode implementation
     *  1. Using linkedHashMap to control the order entry.
     *  2. Added a null validation.
     * @param str
     * @return String
     */
    protected static String encode3(char[] str) {
        Map<Character, Integer> encodeMap = new LinkedHashMap<Character, Integer>();
        if (str != null && str.length > 0) {
            // First element
            encodeMap.put(str[0], 1);
            for (int i = 1; i < str.length; i++) {
                if (encodeMap.containsKey(str[i])) {
                    encodeMap.put(str[i], encodeMap.get(str[i]) + 1);
                } else {
                    encodeMap.put(str[i], 1);
                }
            }
        }
        return convertToString(encodeMap);
    }

    /**
     * Convert to the specific way requested on the requirement.
     * @param encodeMap
     * @return String
     */
    private static String convertToString(Map<Character, Integer> encodeMap) {
        String output = "";
        for (Map.Entry<Character, Integer> entry : encodeMap.entrySet()) {
            output = output + entry.getKey() + entry.getValue();
        }
        return output;
    }
}
